package com.nt.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.nt.model.Product;

@Component
public class ProductRepository {
	private final Map<Long, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    public double calculateTotalValue() {
        return productMap.values().stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
    }
}
