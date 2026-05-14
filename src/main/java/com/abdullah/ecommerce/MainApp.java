package com.abdullah.ecommerce;

import com.abdullah.ecommerce.model.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class MainApp {
    public static void main(String[] args) {

//        Product product = new Product();
//        product.displayProduct();

        BeanFactory factory =
                new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Product product =
                (Product) factory.getBean("productBean");

        product.displayProduct();

    }
}
