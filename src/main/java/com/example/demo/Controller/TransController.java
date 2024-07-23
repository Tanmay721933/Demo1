package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransController {
    @GetMapping
    public void getData(){
        System.out.println("print data which is not useful");
    }

}
