package com.example.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test1")
	public Integer test1() {
		System.out.println("from test1");
		return 200;
	}
	
	@GetMapping("test2")
	public Integer test2() {
		System.out.println("from test2");
		return 200;
	}
	
}
