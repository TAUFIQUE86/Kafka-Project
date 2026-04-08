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