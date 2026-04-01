package com.kafkapublisher.service;

import com.kafkapublisher.constants.AppConstants;
import com.kafkapublisher.entity.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    private final  KafkaTemplate<String , Order> kafkaTemplate;

    public PublisherService(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String addMsg(Order order){

        // sends msg to kafka topic
        kafkaTemplate.send(AppConstants.TOPIC,order);
        return  "Message publice to the kafka topic ";
    }
}

