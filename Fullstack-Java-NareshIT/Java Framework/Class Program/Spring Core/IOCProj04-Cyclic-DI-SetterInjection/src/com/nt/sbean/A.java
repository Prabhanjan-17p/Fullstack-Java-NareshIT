package com.nt.sbean;

public class A {
	private B b;

	public A(B b) {
		super();
		System.out.println("A Constructor 1 parameter constructor");
		this.b = b;
	}

	@Override
	public String toString() {
		return "From A";
	}
	
}
