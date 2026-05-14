package com.abdullah.ecommerce.model;

import com.abdullah.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Product {
//    public void displayProduct() {
//        System.out.println("Product Bean Created Successfully");
//    }

    @Autowired
    private ProductService productService;

    // Constructor Injection
//    @Autowired
//    public Product(ProductService productService) {
//        this.productService = productService;
//    }

    public void displayProduct() {
        productService.serveProduct();
        System.out.println("Product Bean Created Successfully");
    }
}
