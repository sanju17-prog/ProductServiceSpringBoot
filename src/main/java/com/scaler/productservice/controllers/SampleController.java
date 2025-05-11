package com.scaler.productservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {
    // rest controller allows controller to have REST APIs
    // path: http://<domain>/sample/sayHello
    @GetMapping("/sayHello/{name}")
    public String sample(@PathVariable("name") String name){
        return "Hello " + name;
    }

    // path: http://<domain>/sample/sayHello1
    @GetMapping("/sayHello1")
    public String sample1(@RequestParam("x") int x){
        return "Hello World\n".repeat(Math.max(0, x));
    }

}
