package com.nareshIT.day50;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enrter a min number : ");
		int min = sc.nextInt();
		System.out.print("Enrter a max number : ");
		int max = sc.nextInt();
//		System.out.println(min+" : "+max);
		
		Supplier<Integer> ranGen = ()->{
			return generateRandomNumber(min,max);
		};
		System.out.println("Random number generated: "+ranGen.get());
	}
	public static int generateRandomNumber(int min, int max) {
		Random ran = new Random();
		
		int index = ran.nextInt(max-min+1)+min;
		return index;
	}
}
