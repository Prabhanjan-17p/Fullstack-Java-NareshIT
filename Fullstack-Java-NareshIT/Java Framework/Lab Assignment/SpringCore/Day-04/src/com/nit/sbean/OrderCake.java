package com.nit.sbean;

public class OrderCake extends Cake {
	String message_on_cake;
	
	public OrderCake() {
		super();
	}

	public OrderCake(String cake_Flavour, float cake_quantity, String shape_of_cake, String message_on_cake) {
		super(cake_Flavour, cake_quantity, shape_of_cake);
		this.message_on_cake = message_on_cake;
	}

	public OrderCake(String cake_Flavour, float cake_quantity, String shape_of_cake) {
		super(cake_Flavour, cake_quantity, shape_of_cake);
	}
	
	@Override
	public String getOrder() {
		if (message_on_cake == null) {
			return super.getOrder();
		}else {
			 return "OrderCake [message_on_cake="+message_on_cake+", order =Cake [cake_Flavour="+getCake_Flavour()+", cake_quantity="+getCake_quantity()+", shape_of_cake="+getShape_of_cake() +" is ready !! kindly pay Rs."+(getCake_price()*getCake_quantity())+"]";
		}
	}
	
}
