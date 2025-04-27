package com.nareshIT.day59;

public class ShoppingApplication {
    public static void main(String[] args) {
        try {
            Product p1 = new Product(1, "Mobile", 10000, 5);
            Product p2 = new Product(2, "Laptop", 50000, 3);
            Product p3 = new Product(3, "Mouse", 500, 10);

            ShoppingCart cart = new ShoppingCart(10);
            
            cart.addToCart(p1, 2); // valid
//            cart.addToCart(p2, 2); // valid
//          cart.addToCart(p2, 10); // Should throw InsufficientQuantityException
//          cart.addToCart(null, 1); // Should throw InvalidProductException
          cart.addToCart(p3, 12); // You can add more

            System.out.println("Total Amount: ₹" + cart.calculateTotal());

        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
