package com.nareshIT.day44;

public class Circle extends Shape{
	double radius ;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	double area=0.0;
	@Override
	public double getArea() {
		area = 3.14*radius*radius;
		return area;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Area = "+area);
	}
}
