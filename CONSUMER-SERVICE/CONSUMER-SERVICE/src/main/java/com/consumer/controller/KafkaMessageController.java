package com.consumer.controller;

import com.consumer.service.KafkaConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaMessageController {

    private KafkaConsumerService kafkaConsumerService;

    public KafkaMessageController(KafkaConsumerService kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
    }

    // http:localhost:7072/kafka/latest-message
    @GetMapping("/latest-message")
    public String getLatestMessage(){

        return kafkaConsumerService.getLatestMessage();
    }
}
