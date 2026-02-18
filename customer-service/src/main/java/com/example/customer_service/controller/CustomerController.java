package com.example.customer_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-service")
public class CustomerController {

    @Value("${server.port}") private String port;

    @GetMapping("/customers/{id}")
    public String getCustomer(@PathVariable Long id) {
        return "Customer-" + id + " port - " + port;
    }
}
