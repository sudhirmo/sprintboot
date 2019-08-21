package com.divyansh.divyanshart.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeResource {
    @GetMapping
    public String home()
    {
        return "Applcation is Running... "+ new Date();
    }
}
