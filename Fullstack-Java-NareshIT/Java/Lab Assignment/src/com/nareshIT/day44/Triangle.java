package com.nareshIT.day44;

public class Triangle extends Shape{
	double base ;
    double height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	double area=0.0;
	@Override
	public double getArea() {
		area = 0.5*base*height;
		return area;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Area = "+area);
	}
}
