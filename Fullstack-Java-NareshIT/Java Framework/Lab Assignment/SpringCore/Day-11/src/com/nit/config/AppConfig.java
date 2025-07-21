package com.nit.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.sbean.HtmlMessageConverter;
import com.nit.sbean.IMessageConverter;
import com.nit.sbean.MessageConverter;
import com.nit.sbean.PdfMessageConverter;

@Configuration
public class AppConfig {

	@Bean
	public HtmlMessageConverter htmlMessageConverter() {
		return new HtmlMessageConverter();
	}

	@Bean
	public PdfMessageConverter pdfMessageConverter() {
		return new PdfMessageConverter();
	}

	@Bean
	public MessageConverter messageConverter() {
		Map<String, IMessageConverter> strategyMap = new HashMap<>();
		strategyMap.put("html", htmlMessageConverter());
		strategyMap.put("pdf", pdfMessageConverter());
		return new MessageConverter(strategyMap);
	}

}
