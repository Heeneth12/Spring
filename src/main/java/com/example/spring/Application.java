package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hello spring ");
		ApplicationContext context = SpringApplication.run(Application.class,args);

		Test obj= context.getBean(Test.class);
		obj.show();

	}

}
