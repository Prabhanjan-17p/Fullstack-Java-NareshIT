package com.nareshIT.day43;

public class Cake {
	private String shape; 
	private String flavor ;
	private int quantity ;
	private double price = 400 ;
	
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
		this.price = this.price * this.quantity;
		super.toString();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "A "+this.shape+" "+this.flavor+" Cake Of "+this.quantity+" KG is Ready @ "+this.price;
	}
}
