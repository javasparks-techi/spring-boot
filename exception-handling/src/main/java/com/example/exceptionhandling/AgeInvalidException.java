package com.example.exceptionhandling;

public class AgeInvalidException extends RuntimeException{

	public AgeInvalidException(String msg) {
		super(msg);
	}
	
}
