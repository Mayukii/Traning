package com.example.scb.Trainning.controller;

import com.example.scb.Trainning.service.TrainningServicelmpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainningController {

    @Autowired
    private TrainningServicelmpi trainningServicelmpi;

    @GetMapping("/testapi")
    public String getTestApi() {
        return "Hello";
    }

    @GetMapping("/{name}")
    public String getTestApiName(@PathVariable String name) {
        String result = trainningServicelmpi.getName(name);
        return result;
    }

}
