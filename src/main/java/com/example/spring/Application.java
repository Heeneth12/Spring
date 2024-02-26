package com.example.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {
        System.out.println("Hello Spring");


        ApplicationContext context = new ClassPathXmlApplicationContext("springbeen.xml");

        Test obj = (Test) context.getBean("test");
        obj.show();
        obj.getInput();
    }
}


