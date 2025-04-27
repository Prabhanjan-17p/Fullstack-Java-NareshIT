package com.nareshIT.day6;

public class AreaOfCylinder {

	public static void main(String[] args) {
		if(args.length <= 1) {
			return;
		}
		int radius = Integer.parseInt(args[0]);
		int heigth = Integer.parseInt(args[1]);
		
		double res = 2*3.14*radius*heigth+2*3.14*(radius*radius);
		
		System.out.println("Surface of a cylinder = "+res);


	}

}
