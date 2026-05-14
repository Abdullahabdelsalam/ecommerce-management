package com.abdullah.ecommerce.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public void serveProduct() {
        System.out.println("Product Service is working...");
    }

    public ProductService() {
        System.out.println("1 - ProductService Constructor Called");
    }


    @PostConstruct
    public void init() {
        System.out.println("2 - @PostConstruct: Bean Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3 - @PreDestroy: Bean Destroyed");
    }
}
