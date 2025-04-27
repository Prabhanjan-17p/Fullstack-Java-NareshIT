package com.nareshIT.day54;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
			handleClassCastException();
	}
	public static void handleClassCastException() throws ClassCastException
	{
//		Object name[] =  {"Hello", 123, "Java"};
//		Object name[] =  {"Hello", "World", "Java"};
		Object name[] =  {"Hello", true, "Java"};
		for(Object s : name) {
			try {
				String str = (String)s;
				System.out.println("Casting successful: "+str);		
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
