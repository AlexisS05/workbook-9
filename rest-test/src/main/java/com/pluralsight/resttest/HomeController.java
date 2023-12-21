package com.pluralsight.resttest;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = "/home")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String country(@RequestParam(defaultValue = "World") String country){
        return "Hello " + country + "!";
    }
}
