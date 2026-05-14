package com.abdullah.ecommerce;

import com.abdullah.ecommerce.config.AppConfig;
import com.abdullah.ecommerce.model.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//
//        Product product =
//                (Product) context.getBean("productBean");
//
//        product.displayProduct();

        // used Annotation Config ApplicationContext
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        Product product =
//                context.getBean(Product.class);
//
//        product.displayProduct();

        Product p1 = context.getBean(Product.class);
        Product p2 = context.getBean(Product.class);

        p1.displayProductScop();
        p2.displayProductScop();

    }
}
