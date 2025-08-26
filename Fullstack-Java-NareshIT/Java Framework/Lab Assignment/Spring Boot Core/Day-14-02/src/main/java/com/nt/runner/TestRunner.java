package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		 // 1. Find products by category
        System.out.println("\nProducts in Electronics:");
        repo.findByCategory("Electronics").forEach(System.out::println);

        // 2. Find products with price less than 10000
        System.out.println("\nProducts with price < 10000:");
        repo.findByPriceLessThan(10000).forEach(System.out::println);

        // 3. Find available products (stock > 0)
        System.out.println("\nAvailable products:");
        repo.findAvailableProducts().forEach(System.out::println);

        // 4. Find products by name containing keyword
        System.out.println("\nProducts with name containing 'phone':");
        repo.findByNameContainingIgnoreCase("phone").forEach(System.out::println);
	}

}
