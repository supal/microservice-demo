package com.example.order_service.controller;

import com.example.order_service.CustomerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service")
public class OrderController {

    private final CustomerClient customerClient;

    public OrderController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping("/orders/{id}")
    public String getOrder(@PathVariable Long id) {
        return "Order-" + id + " for " + customerClient.getCustomer(id);
    }
}
