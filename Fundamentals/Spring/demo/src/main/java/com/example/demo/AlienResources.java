package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class AlienResources{

    @Autowired
    AlienRepository repo;

    @RequestMapping("aliens")
    // or
    // @GetMapping("aliens")
    public List<Alien> getAliens(){
        List<Alien> aliens = (List<Alien>) repo.findAll();

        return aliens;
    }   
}