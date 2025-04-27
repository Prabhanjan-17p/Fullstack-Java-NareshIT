package com.nareshIT.day6;

public class AreaOfCube {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			return;
		}
		int side = Integer.parseInt(args[0]);
		
		int res = 6* side;
		
		System.out.println("Area of a cube = "+res);

	}

}
