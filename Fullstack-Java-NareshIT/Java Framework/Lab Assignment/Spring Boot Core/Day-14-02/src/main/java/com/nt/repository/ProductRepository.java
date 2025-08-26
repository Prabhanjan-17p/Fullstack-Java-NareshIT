package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    // 1. Find products by category
    @Query(value = "{ 'category' : ?0 }", fields = "{ _id:0, name:1, price:1, catagories:1 }")
    List<Product> findByCategory(String category);

    // 2. Find products with price less than a given value
    @Query(value = "{ 'price' : { $lt : ?0 } }", fields = "{ _id:0, name:1, price:1 }")
    List<Product> findByPriceLessThan(double price);

    // 3. Find products with stock greater than 0
    @Query("{ 'stock' : { $gt : 0 } }")
    List<Product> findAvailableProducts();

    // 4. Find products by name containing a keyword (case-insensitive)
    @Query("{ 'name' : { $regex: ?0, $options: 'i' } }")
    List<Product> findByNameContainingIgnoreCase(String keyword);
}
