package com.consumer;

import com.consumer.constants.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServiceApplication.class, args);

	}

    @KafkaListener(topics = AppConstants.TOPIC, groupId="group_customer_order")
    public void kafakSubscriberContent(String order) {
        System.out.print("_____________ Msg fecthed From Kafka_________________");
        System.out.println(order);

    }

}
