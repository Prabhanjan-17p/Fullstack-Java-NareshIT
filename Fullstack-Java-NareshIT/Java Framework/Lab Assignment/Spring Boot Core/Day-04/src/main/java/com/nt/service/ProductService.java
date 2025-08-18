package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Product;
import com.nt.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public double getTotalInventoryValue() {
		return productRepository.calculateTotalValue();
	}
}
