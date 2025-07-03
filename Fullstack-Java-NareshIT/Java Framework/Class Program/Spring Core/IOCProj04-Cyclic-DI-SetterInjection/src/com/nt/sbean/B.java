package com.nt.sbean;

public class B {
		private A a;


		public B(A a) {
			super();
			System.out.println("B Constructor 1 parameter constructor");
			this.a = a;
		}


		@Override
		public String toString() {
			return "From B";
		}
}
