package com.divyansh.divyanshart.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return "Hello World!";
    }
}
