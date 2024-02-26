package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.SocketOption;
@Component
public class Test {


    @Autowired
    Laptop lap;
    public void show(){

        lap.compile();
        System.out.println("code is runnig no errors ");
    }
}
