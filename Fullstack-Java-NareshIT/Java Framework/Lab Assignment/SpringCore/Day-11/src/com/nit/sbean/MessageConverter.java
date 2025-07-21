package com.nit.sbean;

import java.util.Map;

public class MessageConverter {
	private Map<String, IMessageConverter> store;

	public MessageConverter(Map<String, IMessageConverter> store) {
		super();
		this.store = store;
	}

	public String msg(String type, String message) {
		IMessageConverter converter = store.get(type.toLowerCase());
		if (converter != null) {
			return converter.convertTo(message);
		} else {
			return "Invalid converter type";
		}
	}

}
