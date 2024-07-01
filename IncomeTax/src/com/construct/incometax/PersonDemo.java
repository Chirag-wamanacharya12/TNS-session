package com.construct.incometax;
import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
	    Scanner gender = new Scanner(System.in);  // Creating a Scanner object for gender
	    System.out.println("what is your gender(M/F) :");
	    String userGender = gender.nextLine(); // Reading user input of gender
	    
	    Scanner age = new Scanner(System.in);  // Creating a Scanner object for age
	    System.out.println("what is your age :");
	    int userAge = age.nextInt(); // Reading user input of age
	    
	    Scanner income = new Scanner(System.in);  // Creating a Scanner object for income
	    System.out.println("what is your income :");
	    float userIncome = income.nextFloat(); // Reading user input of income
	    
	    

	    if(userGender.equals("M") && userAge> 65) {
	    	System.out.println("You do not have to pay tax");
	    }
	    else if(userAge<= 65 && userGender.equals("M") && userIncome> 150000  && userIncome<=500000) {
	    	double tax = userIncome*0.1; // Calculating 10% tax for income
	    	System.out.println("You do have to pay tax rs " + tax + " on income " + userIncome);
	    }
	    else if(userAge<= 65 && userGender.equals("M") && userIncome> 500000  && userIncome<=800000) {
	    	double tax = userIncome*0.2;// Calculating 20% tax for income
	    	System.out.println("You do have to pay tax rs " + tax + " on income " + userIncome);
	    }
	    else if(userAge<= 65 && userGender.equals("M") && userIncome> 800000 ) {
	    	double tax = userIncome*0.3;// Calculating 30% tax for income
	    	System.out.println("You do have to pay tax rs " + tax + " on income " + userIncome);
	    }
	    else {
	    	System.out.println("You do not have to pay tax");
	    }
	    
	    gender.close();
	    age.close();
	    income.close();
	    

	}
}
