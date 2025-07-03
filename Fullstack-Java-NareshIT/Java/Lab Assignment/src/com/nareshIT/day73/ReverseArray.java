package com.nareshIT.day73;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
            reverseArray(nums);
        }


    }
    public static void reverseArray(int arr[]){
        System.out.println("Original Array is : "+ Arrays.toString(arr));
        if (arr == null){
            System.out.println("Error...Array object is null");
        }else {
            System.out.print("Reverse Array is : ");
            for (int i = arr.length-1; i >= 0 ; i--) {
                System.out.print(arr[i]+" ");
            }
        }
    }// : this method will print array in reverse order.
}
