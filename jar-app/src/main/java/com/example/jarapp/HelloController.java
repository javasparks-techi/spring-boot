package com.example.jarapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String test() {
		System.out.println("from test");
		return "hello from jar-app";
	}
	
	
}
