package com.abstraction;

public class rectangle extends Shape{
	private float height;
	private float width;
	
	
	public rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}


	
	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public float getWidth() {
		return width;
	}



	public void setWidth(float width) {
		this.width = width;
	}



	public double calArea() {
		return this.area = height*width;
	}
}
