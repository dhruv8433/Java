package com.example.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    // @Autowired is one of the core annotations in Spring, used for automatic dependency injection
    @Autowired
    Laptop l;

    public void code() {
        System.out.println("I am coding");
        l.compile();
    }

}
