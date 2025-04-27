package com.nareshIT.day7;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		
		int num = 121;
		int rev = 0;
		int temp = num ;
		
		while(temp != 0) {
			int last = temp % 10;
			rev = rev * 10 + last;
			temp /= 10;
		}
		
		if (num == rev ) {
			System.out.println("The "+num+ " is palindrome number");
		}
		else {
			System.out.println("The "+num+ " is not palindrome number");
		}

	}

}
