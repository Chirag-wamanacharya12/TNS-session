package com.construct.incometax;

public class Person {
	private String gender;
	private float income;
	private int age;
	
	
	public Person() {
		this.gender = "Male";
		this.income = 150000;
		this.age = 65;
	}


	public Person(String gender, float income, int age) {
		super();
		this.gender = gender;
		this.income = income;
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public float getIncome() {
		return income;
	}


	public void setIncome(float income) {
		this.income = income;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [gender=" + gender + ", income=" + income + ", age=" + age + "]";
	}



	
	

	
	
}
