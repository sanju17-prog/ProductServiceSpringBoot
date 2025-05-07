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
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < x; i++){
            sb.append("Hello World\n");
        }
        return sb.toString();
    }

}
