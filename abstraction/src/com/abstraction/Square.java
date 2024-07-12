package com.abstraction;

public class Square extends Shape {
	private float side;
	
	
	public Square(float side) {
		super();
		this.side = side;
	}

	

	public float getSide() {
		return side;
	}



	public void setSide(float side) {
		this.side = side;
	}



	public double calArea() {
		return this.area = side*side;
	}
}
