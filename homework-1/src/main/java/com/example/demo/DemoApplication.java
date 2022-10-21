package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	String helloWorld() {
		return "Hello world";
	}

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello, " + name;
	}

	@PostMapping("/hello")
	@ResponseBody
	String helloNameBody(@Valid @RequestBody RequestData data) {
		return "Hello, " + data.name;
	}

}
