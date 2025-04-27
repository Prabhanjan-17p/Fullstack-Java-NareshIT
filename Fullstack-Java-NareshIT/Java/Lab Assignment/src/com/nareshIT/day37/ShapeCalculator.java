package com.nareshIT.day37;

public class ShapeCalculator {

	public int calculateArea(int sideLength) {
		if (sideLength <= 0) {
			System.err.println("Error: Side length must be non-negative.");
			System.exit(0);
		}
		System.out.print("Area of a squar: ");
		return sideLength*sideLength;
	}
	public int calculateArea(int length, int width) {
		if (length <= 0 || width <= 0) {
			System.err.println("Error: Length and width must be non-negative.");
			System.exit(0);
		}
		System.out.print("Area of a rectangl :");
		return length*width;
	}
	public double calculateArea(double radius) {
		System.out.print("Area of circle with radius "+radius+" (PI = 3.21):");
		return (3.21*(radius*radius));
	}
}
