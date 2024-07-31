package com.Spring_Boot.Spring_Boot_First_App_Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}
