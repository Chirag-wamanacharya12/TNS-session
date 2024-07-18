package com.exception;

public class voterInfo {
	private String name;
	private int age;
	public voterInfo(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	public voterInfo() {
		name = "chirag";
		age = 18;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
			AgeValidator.isValidAge( age);
			this.age = age;
		} catch(InvalidAgeException e)
		{
			System.err.println("Enter valid age");
		}

	}
	
	@Override
	public String toString() {
		return "voterInfo [name=" + name + ", age=" + age + "]";
	}
	
	

}
