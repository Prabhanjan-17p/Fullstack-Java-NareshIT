package com.nit.sbean;

public abstract class Cake {
	String cake_Flavour;
	float cake_quantity;
	static double cake_price = 300;
	String shape_of_cake;
	
	public Cake(){
		cake_Flavour = "vanilla";
		cake_quantity = 1;
		cake_price = 300;
		shape_of_cake = "square";
	}

	public Cake(String cake_Flavour, float cake_quantity, String shape_of_cake) {
		super();
		this.cake_Flavour = cake_Flavour;
		this.cake_quantity = cake_quantity;
		this.shape_of_cake = shape_of_cake;
	}

	public String getCake_Flavour() {
		return cake_Flavour;
	}

	public void setCake_Flavour(String cake_Flavour) {
		this.cake_Flavour = cake_Flavour;
	}

	public float getCake_quantity() {
		return cake_quantity;
	}

	public void setCake_Quantity(float cake_quantity) {
		this.cake_quantity = cake_quantity;
	}

	public static double getCake_price() {
		return cake_price;
	}

	public static void setCake_Price(double cake_price) {
		Cake.cake_price = cake_price;
	}

	public String getShape_of_cake() {
		return shape_of_cake;
	}

	public void setShape_Of_Cake(String shape_of_cake) {
		this.shape_of_cake = shape_of_cake;
	}
	
	public String getOrder() {
		 return "Cake [cake_Flavour="+getCake_Flavour()+", cake_quantity="+getCake_quantity()+", shape_of_cake="+getShape_of_cake() +" is ready !! kindly pay Rs."+(getCake_price()*getCake_quantity())+"]";
	}
	
}
