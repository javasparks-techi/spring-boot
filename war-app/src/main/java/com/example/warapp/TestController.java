package com.example.warapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test")
	public String test() {
		System.out.println("from test- war-app");
		return "from test- war-app";
	}
	
	
}
