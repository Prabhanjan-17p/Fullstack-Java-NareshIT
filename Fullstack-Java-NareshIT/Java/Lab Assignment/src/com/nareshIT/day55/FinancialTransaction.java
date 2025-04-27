package com.nareshIT.day55;

public class FinancialTransaction {

    public void processTransaction(double amount, long accountNumber) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }

            if (String.valueOf(accountNumber).length() != 10) {
                throw new IllegalArgumentException("Invalid account number format.");
            }

            System.out.println("Processing transaction...");
            System.out.println("Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);

        } catch (IllegalArgumentException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        }
    }
}
