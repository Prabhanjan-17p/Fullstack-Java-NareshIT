package com.nareshIT.day52;

public class ExceptionHandlingDemo {

	public static void handleExceptions(String name) {
		try {
			System.out.println("Length of the input string: "+name.length());
			int num = Integer.parseInt(name);
			System.out.println("After Converting integer : "+num);
		} catch (Exception e) {
			//TestCase- 1
//			System.out.println(e);
			
			//TestCase- 2 or 3
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//TestCase - 1
//		String name =  "123";  // Length of the input string: 3 // After Converting integer : 123
//		handleExceptions(name);
		
		
		//TestCase - 2
//		String name1 =  "abc";
//		handleExceptions(name1);
		
		
		//TestCase - 3
		String name2 =  null;
		handleExceptions(name2);
	}

}
