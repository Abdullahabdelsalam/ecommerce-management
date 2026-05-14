package com.abdullah.ecommerce.model;

import com.abdullah.ecommerce.service.ProductService;

public class Product {
//    public void displayProduct() {
//        System.out.println("Product Bean Created Successfully");
//    }

    private ProductService productService;

    // Constructor Injection
    public Product(ProductService productService) {
        this.productService = productService;
    }

    public void displayProduct() {
        productService.serveProduct();
        System.out.println("Product Bean Created Successfully");
    }
}
