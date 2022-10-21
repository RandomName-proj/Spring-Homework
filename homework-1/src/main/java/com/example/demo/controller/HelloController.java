package com.example.demo.controller;

import com.example.demo.RequestData;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloController {
    @GetMapping("/hello")
    String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }

    @PostMapping("/hello")
    String helloNameBody(@Valid @RequestBody RequestData data) {
        return "Hello, " + data.name;
    }
}
