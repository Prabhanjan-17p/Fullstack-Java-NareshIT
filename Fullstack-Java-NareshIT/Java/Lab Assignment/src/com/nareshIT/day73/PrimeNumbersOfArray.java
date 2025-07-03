package com.nareshIT.day73;

import java.util.Scanner;

public class PrimeNumbersOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextByte();

        int [] nums ;

        if (size < 0){
            System.out.println("Error...Negative size");
        } else if (size == 0) {
            System.out.println("Error...Negative size");
        }else{
            nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Enter the value of "+(i+1)+" Position :");
                int n = sc.nextInt();
                nums[i] =n;
            }
            for (int i : nums){
                if (isPrime(i)){
                    System.out.println(i);
                }
            }
        }
 
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }// : this method will check given element is prime or not and will return true/false.
}

