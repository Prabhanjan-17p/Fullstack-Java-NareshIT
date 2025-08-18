package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Product;
import com.nt.service.ProductService;

@Component
public class ProductController {
	@Autowired
	private ProductService productService;

	public String addProduct(Product product) {
		productService.addProduct(product);
		return "Product added successfully!";
	}

	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	public String getTotalInventoryValue() {
		double total = productService.getTotalInventoryValue();
		return "Total Inventory Value: ₹" + total;
	}
}
