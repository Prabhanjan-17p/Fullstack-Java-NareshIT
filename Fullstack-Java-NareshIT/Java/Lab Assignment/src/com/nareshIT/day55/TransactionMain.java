package com.nareshIT.day55;

import java.util.Scanner;

public class TransactionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinancialTransaction transaction = new FinancialTransaction();

        try {
            System.out.print("Enter transaction amount: ");
            String amountInput = scanner.nextLine();

            System.out.print("Enter account number: ");
            String accountInput = scanner.nextLine();

            double amount = Double.parseDouble(amountInput);
            long accountNumber = Long.parseLong(accountInput);

            transaction.processTransaction(amount, accountNumber);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
