package com.nareshIT.day70;


public class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
      
        if (this.getClass() != obj.getClass()) {
            System.out.println("You can't compare because two different class. ");
            return false;
        }

        Product pro = (Product) obj;
        return this.productId == pro.productId && this.productName == pro.productName;
    }

   
}