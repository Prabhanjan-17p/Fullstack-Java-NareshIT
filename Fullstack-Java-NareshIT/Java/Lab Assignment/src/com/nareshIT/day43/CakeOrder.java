package com.nareshIT.day43;

import java.util.Scanner;

public class CakeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Choice");
		int chi = sc.nextInt();
		sc.nextLine();
		
		Cake oc = null;
		switch (chi) {

		case 1: 
			 oc = new OrderedCake();
			break;
		case 2: 
//			System.out.println("Enter Shape");
			String sh = sc.nextLine();
//			System.out.println("Enter Fal");
			String fla = sc.nextLine();
//			System.out.println("Enter Shape");
			int qnt = sc.nextInt();
			if (qnt < 0) {
				System.out.println("Qnt Must be posetive");
				System.exit(0);
			}
			 oc = new OrderedCake(sh, fla, qnt);
			break;
		case 3: 
//			System.out.println("Enter Shape");
			String sh1 = sc.nextLine();
//			System.out.println("Enter Fal");
			String fla1 = sc.nextLine();
//			System.out.println("Enter Shape");
			int qnt1 = sc.nextInt();
			sc.nextLine();
//			System.out.println("Enter MAs");
			String msg = sc.nextLine();
			if (qnt1 < 0) {
				System.out.println("Qnt Must be posetive");
				System.exit(0);
			}
			 oc = new OrderedCake(sh1, fla1, qnt1,msg);
			 System.out.println(oc);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
