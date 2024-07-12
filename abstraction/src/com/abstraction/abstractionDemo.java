package com.abstraction;

public class abstractionDemo {

	public static void main(String[] args) {
		Shape s; 
		
		s =new Circle(2);
		s.calArea();
		s.showArea();
		
		s =new Square(5);
		s.calArea();
		s.showArea();
		
		s =new rectangle(5,9);
		s.calArea();
		s.showArea();
	}
}
