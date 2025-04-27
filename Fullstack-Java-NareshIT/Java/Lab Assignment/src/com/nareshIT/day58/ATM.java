package com.nareshIT.day58;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BankAccount b1 = new BankAccount(1, 5000);
            BankAccount b2 = new BankAccount(2, 3000); 
            Customer c1 = new Customer(b1, "Prabhanjan");

            boolean ch = true;
            while (ch) {
                System.out.println("\nSelect an option :\n"
                        + "     1. Deposit\n"
                        + "     2. Withdraw\n"
                        + "     3. Transfer\n"
                        + "     4. Loan Application\n"
                        + "     5. Check Balance\n"
                        + "     6. Exit");
                System.out.print("Enter your option : ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        try {
                            System.out.print("Enter amount to deposit: ");
                            double amt = sc.nextDouble();
                            c1.getBankAccount().deposite(amt);
                        } catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.print("Enter amount to withdraw: ");
                            double with = sc.nextDouble();
                            c1.getBankAccount().withdraw(with);
                        } catch (InvalidAmountException | InsufficientFundsException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.print("Enter amount to transfer: ");
                            double trn = sc.nextDouble();
                            c1.getBankAccount().transfer(b2, trn);
                        } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            System.out.print("Enter loan amount: ");
                            double loanAmount = sc.nextDouble();
                            c1.getBankAccount().applyForLoan(loanAmount);
                        } catch (LoanNotAllowedException | InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Current Balance: " + c1.getBankAccount().getBalance());
                        break;
                    case 6:
                        ch = false;
                        System.out.println("Thank you for using our ATM.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}