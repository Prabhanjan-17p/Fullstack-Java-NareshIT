package com.nareshIT.day44;

public class MainShap {

	public static void main(String[] args) 
	{
		Shape s = null;
		s = new Rectangle(30.3, 45.4);
		s.getArea(); s.printDetails();

		s = new Circle(23.2);
		s.getArea(); s.printDetails();
		
		s = new Triangle(146.2, 40.0);
		s.getArea(); s.printDetails();
	}

}
