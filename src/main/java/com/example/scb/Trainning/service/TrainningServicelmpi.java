package com.example.scb.Trainning.service;

import org.springframework.stereotype.Service;

@Service
public class TrainningServicelmpi implements TrainningService{

    public String getName(String name) {
        return "Hello " + name;
    }

}