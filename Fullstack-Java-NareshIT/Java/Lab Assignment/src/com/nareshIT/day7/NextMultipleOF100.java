package com.nareshIT.day7;

public class NextMultipleOF100 {
    public static void main(String[] args) {
    	int num = Integer.parseInt(args[0]);
//        int num = 123; 

        if (num <= 0) {
            System.out.println("-1"); 
        } else {
            int nextMul = ((num / 100) + 1) * 100;
            System.out.println("The next multiple of 100 for " + num + " is " + nextMul);
        }
    }
}
