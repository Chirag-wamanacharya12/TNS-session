package com.exception;

public class InvalidAgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvalidAgeException(){
		super("Invalid age");
	}
	InvalidAgeException(String message){
		super(message);
	}

}
