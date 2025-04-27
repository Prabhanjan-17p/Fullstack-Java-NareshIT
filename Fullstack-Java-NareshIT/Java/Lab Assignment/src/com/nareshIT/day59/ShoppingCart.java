package com.nareshIT.day59;

public class ShoppingCart {
    private Product[] cartItems;
    private int[] quantities;
    private int itemCount;

    public ShoppingCart(int capacity) {
        cartItems = new Product[capacity];
        quantities = new int[capacity];
        itemCount = 0;
    }

    public void addToCart(Product product, int quantity) throws InsufficientQuantityException {
        if (product == null) {
            throw new InvalidProductException("Product not found");
        }

        if (itemCount >= cartItems.length) {
            throw new InvalidProductException("Cart is full");
        }

        product.decreaseQuantity(quantity); 
        
        cartItems[itemCount] = product;
        quantities[itemCount] = quantity;
        itemCount++;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].price * quantities[i];
        }
        return total;
    }
}
