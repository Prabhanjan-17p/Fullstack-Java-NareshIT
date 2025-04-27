package com.nareshIT.day3;

public class salaryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 if (args.length == 0) {
	            System.out.println("Enter a basic salary as a command line argument.");
	            return;
	        }
		 int sal  = Integer.parseInt(args[0]);
		 float HRA = (sal)*0.15f;
		 float ConveyanceAllowance = (sal)*0.15f;
		 float EntertainmentAllowance = (sal)*0.10f;
		 float tot = HRA+ConveyanceAllowance+EntertainmentAllowance;
		 System.out.println("Total salary = "+ tot);
	}

}
