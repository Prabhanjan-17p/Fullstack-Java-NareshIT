package com.nareshIT.day73;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int x [] = {5,2,21,4,32};
        System.out.println("Original Array : "+Arrays.toString(x));
        int ase[] =ascendingSort(x);
        System.out.println("Ascending Order  : "+Arrays.toString(ase));
        int dse[] =descendingSort(x);
        System.out.println("Descending Order :"+Arrays.toString(dse));
    }
    public static int[] ascendingSort(int arr[]) {
        int asc[] = new int[arr.length];
        for (int j = 0; j < asc.length; j++) {
            asc[j] = arr[j];
        }
        for (int j = 0; j < asc.length; j++) {
            for (int k = j; k < asc.length; k++) {
                if (asc[j] > asc[k]){
                    int x = asc[k];
                    asc[k] = asc[j];
                    asc[j] = x;
                }
            }
        }
        return  asc;
    }//: this method will return sorted array object in ascending order.
    public static int[] descendingSort(int arr[]) {
        int asc[] = new int[arr.length];
        for (int j = 0; j < asc.length; j++) {
            asc[j] = arr[j];
        }
        for (int j = 0; j < asc.length; j++) {
            for (int k = j; k < asc.length; k++) {
                if (asc[j] < asc[k]){
                    int x = asc[k];
                    asc[k] = asc[j];
                    asc[j] = x;
                }
            }
        }
        return  asc;
    }//: this method will return sorted array object in descending order.

}
