package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransController {
    @GetMapping
    public void getData(){
        System.out.println("print data which ");
        System.out.println("addded this new line of code in second branch");
        System.out.println("added some lines of code to check commit history");
    }
}

