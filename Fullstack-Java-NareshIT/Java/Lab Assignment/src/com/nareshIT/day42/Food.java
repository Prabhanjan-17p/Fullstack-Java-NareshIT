package com.nareshIT.day42;

public abstract  class Food {
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	
	public double getProteins() {
		return proteins;
	}

	public double getFats() {
		return fats;
	}

	public double getCarbs() {
		return carbs;
	}

	public Food(double proteins, double fats, double carbs) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
	}

	abstract void getMacroNutrients();
}

class Egg extends Food{
	int tastyScore = 7;
	String type = "non-vegetarian";

	public Egg(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
	}

	@Override
	void getMacroNutrients() {
		System.out.println("Bread : "+type);
		System.out.println("An egg has "+this.proteins+" gms of protein,"+this.fats+"  gms of fats and"+this.carbs+" gms of carbohydrates.");
		System.out.println("Test : "+tastyScore);
	}
	
}


class Bread extends Food {
	int tastyScore = 8;
	String type ="vegetarian";
	public Bread(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
	}
	
	@Override
	void getMacroNutrients() {
		System.out.println("Bread : "+type);
		System.out.println("A slice of bread has "+this.proteins+" gms of protein,"+this.fats+"  gms of fats and"+this.carbs+" gms of carbohydrates.");
		System.out.println("Test : "+tastyScore);
	}
}
