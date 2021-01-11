package com.example.scb.Trainning.controller;

import com.example.scb.Trainning.service.TrainningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainningController {

    @Autowired
    TrainningService trainningService;

    @GetMapping("/testapi")
    public String getTestApi() {
        return "Hello";
    }

    @GetMapping("/{name}")
    public String getTestApiName(@PathVariable String name) {
        String result = trainningService.getName(name);
        return result;
    }
}
