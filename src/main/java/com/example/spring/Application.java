package com.example.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello Spring");

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new FileSystemResource("Springbeen.xml"));

        Test obj = (Test) factory.getBean("test");
        obj.show();
    }
}
