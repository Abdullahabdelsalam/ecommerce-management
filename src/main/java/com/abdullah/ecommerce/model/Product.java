package com.abdullah.ecommerce.model;

import com.abdullah.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("singleton")
@Scope("prototype")
public class Product {
//    public void displayProduct() {
//        System.out.println("Product Bean Created Successfully");
//    }

    public Product() {
        System.out.println("Product Constructor Called: " + this);
    }

    public void displayProductScop() {
        System.out.println("Product method called: " + this);
    }

    private  ProductService productService;

    // Constructor Injection
//    @Autowired
    public Product(ProductService productService) {
        this.productService = productService;
        System.out.println("Product Constructor Called");
    }

    public void displayProduct() {
        productService.serveProduct();
        System.out.println("Product Bean Created Successfully");
    }
}
