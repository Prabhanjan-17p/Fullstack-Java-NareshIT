package com.nareshIT.day12;

import java.util.Scanner;

public class Product {
	int productId;
	String productName ;
	double productPrice;
	
	
	public void setProductDetails() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the product  id : ");
		productId = sc.nextInt();
		System.out.println("Enter the product name : ");
		productName = sc.nextLine();
		productName = sc.nextLine(); // due 1st int come 
		System.out.println("Enter the product price : ");
		productPrice = sc.nextDouble();
	}
	
	
	public void getProductDetails() {
		System.out.println("Emp number is : "+productId);
		System.out.println("Emp Name is: "+productName);
		System.out.println("Emp salary is: "+productPrice);
	}
}
