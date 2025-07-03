package com.nt.sbean;

public class A {
	private B b;

	public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	public A() {
		super();
		System.out.println("A.Constructor with 0-paramater");
	}

	@Override
	public String toString() {
		return "From A";
	}
	
}
