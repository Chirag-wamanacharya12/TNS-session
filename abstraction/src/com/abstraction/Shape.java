package com.abstraction;

public abstract class Shape {
	public double area;
	public void showArea() {
		System.out.println("The area of shape is "+area);
	}
	
	// Abstract method
	public abstract double calArea();
}
