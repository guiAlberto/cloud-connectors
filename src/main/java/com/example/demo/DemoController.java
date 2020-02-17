package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * DemoController
 */
@RestController
public class DemoController {

    @GetMapping(value="/demo")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}