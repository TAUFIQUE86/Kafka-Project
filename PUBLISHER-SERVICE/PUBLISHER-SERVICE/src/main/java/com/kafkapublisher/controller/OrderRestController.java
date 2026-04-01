package com.kafkapublisher.controller;

import com.kafkapublisher.entity.Order;
import com.kafkapublisher.service.PublisherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/msg")
public class OrderRestController {

    private final PublisherService publisherService;

    public OrderRestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

//  http://localhost:7071/api/v1/msg/create
    // http://localhost:7071/api/v1/msg/create
    @PostMapping("/create")
    public  String createOrder(@RequestBody Order order){

        String response = publisherService.addMsg(order);
        return  response;

    }
}
