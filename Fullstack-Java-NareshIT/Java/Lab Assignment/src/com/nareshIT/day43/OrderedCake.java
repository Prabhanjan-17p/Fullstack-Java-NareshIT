package com.nareshIT.day43;

public class OrderedCake extends Cake{
	private String name;

	public OrderedCake(String shape, String flavor, int quantity,String name) {
		super(shape,flavor,quantity);
		this.name = name;
	}
	
	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape,flavor,quantity);
		System.out.println(super.toString());
	}
	
	
	public OrderedCake() {
		super("Round","Vanila",1);
//		setPrice(400);
		System.out.println(super.toString());
	}

	@Override
	public String toString() {
		return "A "+getShape()+" "+getFlavor()+" Cake Of "+getQuantity()+"KG is Ready with "+this.name+" message @ "+getPrice();
	}
}
