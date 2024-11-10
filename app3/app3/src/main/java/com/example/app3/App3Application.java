package com.example.app3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(App3Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("command line argument:");
		for(String arg : args) {
			System.out.println(arg);
		}	
	}

}
