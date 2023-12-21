package com.pluralsight.resttest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping(method = RequestMethod.GET, path = "/product")
    Product getAnyProduct(){
        return new Product(23, "Hot Dog", 2.50);
    }
}
