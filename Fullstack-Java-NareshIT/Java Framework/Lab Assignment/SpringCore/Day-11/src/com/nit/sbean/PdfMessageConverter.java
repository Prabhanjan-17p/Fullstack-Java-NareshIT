package com.nit.sbean;

public class PdfMessageConverter implements IMessageConverter{

	@Override
	public String convertTo(String message) {
		return "<pdf>"+message+"</pdf>";
	}
}
