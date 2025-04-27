package com.nareshIT.day55;

class ParentClass {
	public void loadingClass(String name) throws ClassNotFoundException 
	{
		Class.forName(name);
		System.out.println("Class loaded successfully: "+name);
	}
	
}

class ChildClass extends ParentClass{
	
	@Override
	public void loadingClass(String name) 
	{
		try {
			if (name =="") {
				throw new IllegalArgumentException();
			}
			else {
				super.loadingClass(name);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Tester {

	public static void main(String[] args)  {
			ChildClass c = new ChildClass();
			c.loadingClass("NonExistentClass");

	}

}
