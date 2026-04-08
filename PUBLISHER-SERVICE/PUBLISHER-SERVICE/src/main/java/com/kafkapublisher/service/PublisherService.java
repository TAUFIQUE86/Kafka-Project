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

/*

cd C:\kafka\bin\windows
zookeeper-server-start.bat zookeeper.properties
```

Wait until you see:
```
binding to port 0.0.0.0/0.0.0.0:2181


cd C:\kafka\bin\windows
kafka-server-start.bat server.properties
```

Wait until you see:
```
KafkaServer id=0] started


// for consumer
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic order_placed --from-beginning


*/