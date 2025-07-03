package com.nareshIT.day73;


import java.util.Scanner;

public class SumOfArray {
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
           System.out.println("Sum = "+sumOfArray(nums));
        }


    }
    public static int sumOfArray(int arr[]){
        int sum =0;
        if (arr==null){
            System.out.println("Error...Array object is null");
            System.exit(0);
        }else {
            for (int x : arr){
                sum +=x;
            }
        }
        return sum;
    };// : this method will return sum of array elements.
}
