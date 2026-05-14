package com.abdullah.ecommerce;

import com.abdullah.ecommerce.model.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//import org.springframework.beans.factory.xml.XmlBeanFactory;

public class MainApp {
    public static void main(String[] args) {

//        Product product = new Product();
//        product.displayProduct();

//         used BeanFactory
//        BeanFactory factory =
//                new XmlBeanFactory(new ClassPathResource("beans.xml"));

        // used ApplicationContext
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//        Product product =
//                (Product) context.getBean("productBean");
//
//        product.displayProduct();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Product product =
                (Product) context.getBean("productBean");

        product.displayProduct();


    }
}
