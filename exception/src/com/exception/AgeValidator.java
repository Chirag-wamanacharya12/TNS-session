package com.exception;

public class AgeValidator {
	public static void isValidAge(int age) throws InvalidAgeException  {
		if(age>18) {
			System.out.println("voter is eligible");
		}else
		{
			throw new InvalidAgeException();
		}
	}
}
