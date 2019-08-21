package com.divyansh.divyanshart.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @RequestMapping(value = "/user")
    public String allUsers()
    {
        return "All Users Here";
    }

}
