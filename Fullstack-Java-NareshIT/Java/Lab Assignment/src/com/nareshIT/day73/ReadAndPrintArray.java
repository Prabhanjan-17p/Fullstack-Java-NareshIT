package com.nareshIT.day73;


import java.util.Arrays;
import java.util.Scanner;

public class ReadAndPrintArray {

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
            usingArraysToString(nums);
            usingForLoop(nums);
            usingForEachLoop(nums);
        }


    }
    public static void usingForLoop(int arr[]) {
        System.out.println("usingForLoop");
        if (arr==null){
            System.out.println("Error...Array object is null");
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }

    } //: this method will print array values using for loop

    public static void usingForEachLoop(int arr[]){
        System.out.println("usingForEachLoop");
        if (arr==null){
            System.out.println("Error...Array object is null");
        }else {
            for(int val : arr){
                System.out.print(val+" ");
            }
            System.out.println("");
        }
    }// : this method will print array values using for_each loop

    public static void usingArraysToString(int arr[]){
        System.out.println("usingArraysToString");
        if (arr==null){
            System.out.println("Error...Array object is null");
        }else {
            System.out.println(Arrays.toString(arr));
        }
    }// : this method will print array values using Arrays.toString() method.

}
