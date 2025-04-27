package com.nareshIT.day44;

public class CallAnimal {

	public static void main(String[] args) {
		Animal ld = null;
		ld = new Lion();
		ld.roam();
		getAnimal(ld);
		
		System.out.println("-----------------------");
		
		ld = new Dog();
		ld.roam();
		getAnimal(ld);
	}
	
	public static void getAnimal(Animal a) {
		
		if (a instanceof Dog d) {
			//Dog d = (Dog)a;
			d.bark();
		}
		else if (a instanceof Lion l){
			l.roar();
		}
	}

}
