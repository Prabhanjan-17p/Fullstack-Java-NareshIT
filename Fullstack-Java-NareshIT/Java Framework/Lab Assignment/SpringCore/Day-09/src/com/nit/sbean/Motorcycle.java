package com.nit.sbean;


public class Motorcycle implements Vehicle {
	
	String engineType;
	boolean hasSidecar;
	
	public Motorcycle(String engineType, boolean hasSidecar) {
		super();
		this.engineType = engineType;
		this.hasSidecar = hasSidecar;
	}

	@Override
	public String getDescription() {
		return  "Motorcycle :: hasSidecar-"+hasSidecar+" :: Engine Type-"+engineType;
	}
	
	
}
