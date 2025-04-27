package com.nareshIT.day3;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {

        if(args.length == 0) {
            System.out.print("Enter temperature in Fahrenheit: ");
            return;
        }
        double fahrenheit = Integer.parseInt(args[0]);

        // Convert Fahrenheit to Celsius
        double celsius = ((fahrenheit - 32) * 5) / 9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);


	}

}
