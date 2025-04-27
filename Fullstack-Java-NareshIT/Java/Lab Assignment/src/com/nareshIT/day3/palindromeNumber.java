package com.nareshIT.day3;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Enter a number to check the number is is palindrom or not ");
			return;
		}
	     int num = Integer.parseInt(args[0]);
       int temp = num;
       int rev = 0;
       while (temp != 0){
           int last = temp%10;
           rev = last+rev*10;
           temp = temp /10;
       }
       if (num == rev){
           System.out.println(num + " Is palindrome");
       }else {
           System.out.println(num + " Is not palindrome");
       }
	}

}
