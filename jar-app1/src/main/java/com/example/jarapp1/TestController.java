package com.example.jarapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test")
	public String test() {
		System.out.println("from test of jar-app1");
		return "from jar-app1";				
	}
	
}
