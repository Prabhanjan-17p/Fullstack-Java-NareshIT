package com.nareshIT.day49;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {

	public static void main(String[] args) {
		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 
		 Random ran = new Random();
//		 int con = ran.nextInt(3);
//		 System.out.println(con);
		 
		Supplier<String> pass = () -> {
			
//			return pass1(upper,lower,digits,special);
//			return pass2(upper,lower,digits,special);
			return pass3(upper,lower,digits,special);
		};
		System.out.println("password = "+pass.get());
	}
	public static String pass1(String upper,String lower,String digits,String special) {
		Random ran = new Random();
		String passWord = "";
			 for(int i =1;i<=8;i++) {
				 if (i == 1 || i == 5) {
					 int chUpper = ran.nextInt(26);
					 passWord += upper.charAt(chUpper);
				}else if (i == 2 || i == 6) {
					int chLower = ran.nextInt(26);
					passWord += lower.charAt(chLower);
				}else if (i == 3 || i == 7) {
					int chNum = ran.nextInt(10);
					passWord += digits.charAt(chNum);
				}else if (i == 4 || i == 8){
					int chSpecial = ran.nextInt(7);
					passWord += special.charAt(chSpecial);
				}
		}
		return passWord;
	}
	public static String pass2(String upper,String lower,String digits,String special) {
		Random ran = new Random();
		String passWord = "";
		while(passWord.length() != 16) {
			 int chFirst = ran.nextInt(4);
				 if (chFirst == 1 ) {
					 int chUpper = ran.nextInt(26);
					 passWord += upper.charAt(chUpper);
				}else if (chFirst == 2 ) {
					int chLower = ran.nextInt(26);
					passWord += lower.charAt(chLower);
				}else if (chFirst == 3 ) {
					int chNum = ran.nextInt(10);
					passWord += digits.charAt(chNum);
				}else if (chFirst == 4 ){
					int chSpecial = ran.nextInt(7);
					passWord += special.charAt(chSpecial);
				}
			 }
		return passWord;
	}
	
	public static String pass3(String upper,String lower,String digits,String special) {
		Random ran = new Random();
		String totString = upper+lower+digits+special;
		String passWord = "";
		for(int i =1;i<=8;i++) {
			int index = ran.nextInt(69);
			passWord += totString.charAt(index);
		}
		return passWord;
	}

}
