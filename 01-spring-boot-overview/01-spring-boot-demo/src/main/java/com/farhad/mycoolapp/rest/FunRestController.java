package com.farhad.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // set up rest controller
public class FunRestController {

    @GetMapping("/") // Handle HTTP request
    public String sayHello(){
        return "Hello World";
    }
}

