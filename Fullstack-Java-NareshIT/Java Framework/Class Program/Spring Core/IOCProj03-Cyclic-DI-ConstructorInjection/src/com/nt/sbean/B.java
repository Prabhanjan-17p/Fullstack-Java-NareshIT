package com.nt.sbean;

public class B {
		private A a;

		public void setA(A a) {
			this.a = a;
		}


		public B() {
			super();
			System.out.println("B.Constructor with 0-parameter");
		}


		@Override
		public String toString() {
			return "From B";
		}
}
