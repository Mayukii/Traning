package com.example.scb.Trainning.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainningServicelmpi implements TrainningService {


    public String getName(String name) {
        return "Hello " + name;
    }

}
