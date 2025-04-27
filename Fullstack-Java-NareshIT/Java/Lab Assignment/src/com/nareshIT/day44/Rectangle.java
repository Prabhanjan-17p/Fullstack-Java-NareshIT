package com.nareshIT.day44;

public class Rectangle extends Shape{
	double length ;
    double breadth;
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	double area=0.0;
	@Override
	public double getArea() {
		area = length*breadth;
		return area;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Area = "+area);
	}
}
