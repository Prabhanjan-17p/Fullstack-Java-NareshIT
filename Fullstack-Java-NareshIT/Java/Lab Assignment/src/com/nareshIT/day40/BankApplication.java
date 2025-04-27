package com.nareshIT.day40;

import java.util.*;

public class BankApplication{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int ch =0;
    ch = sc.nextInt();
    sc.nextLine();
    BankAccount s = null;
    switch(ch){
        case 1:
        String name = sc.nextLine();
        String acNumber = sc.nextLine();
        double bal = sc.nextDouble();
        s = new SavingsAccount(name,acNumber,bal);
        s.displayAccountDetails();
        s.calculateInterest();
        break;

        case 2:
        String name1 = sc.nextLine();
        String acNumber1 = sc.nextLine();
        double bal1 = sc.nextDouble();
        s = new CurrentAccount(name1,acNumber1,bal1);
        s.displayAccountDetails();
        s.calculateInterest();
        break;

        case 3:
        String name2 = sc.nextLine();
        String acNumber2 = sc.nextLine();
        double bal2 = sc.nextDouble();
        int years2 = sc.nextInt();
        s = new FixedDepositAccount(name2,acNumber2,bal2,years2);
        s.displayAccountDetails();
        s.calculateInterest();
        break ;

        default:
            System.out.println("Invalid account type.");
    	}
    }
}

class BankAccount{
  protected String accountHolderName ;
  protected String accountNumber;
  protected double balance;
  public static final String IFSC_CODE ="SBIHYD151285";

  public BankAccount(String accountHolderName,String accountNumber,double balance){
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.balance = balance;

    if(accountHolderName == ""){
        System.out.println("Account holder name cannot be empty.");
        System.exit(0);
    }
    if(accountNumber == ""){
        System.out.println("Account number cannot be empty.");
        System.exit(0);
    }
    if(balance < 0){
        System.out.println("Balance cannot be negative.");
        System.exit(0);
    }
  }
  public void  calculateInterest(){
    System.out.println("write a generic message regarding Bank interest Calculation.");
  }

  public void  displayAccountDetails(){
    System.out.println("write a generic message regarding displayAccountDetails.");
  }

}

class SavingsAccount extends BankAccount {
    protected double interestRate = 4.0;

    SavingsAccount(String accountHolderName,String accountNumber,double balance){
        super(accountHolderName,accountNumber,balance);
    }

    public void  displayAccountDetails(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance RS: "+balance);
        System.out.println("IFSC CODE: "+IFSC_CODE);
    }

    public void  calculateInterest(){
        // (4000000*(4/100))
        double interestOFSaving = (balance*(interestRate/100));
        System.out.println("Savings Account Interest RS: "+interestOFSaving);
    }
}

class CurrentAccount extends BankAccount{
    protected double overdraftLimit = 5000.0;
    
    CurrentAccount(String accountHolderName,String accountNumber,double balance){
        super(accountHolderName,accountNumber,balance);
    }

    public void  displayAccountDetails(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance RS: "+balance);
        System.out.println("IFSC CODE: "+IFSC_CODE);
    }

    public void  calculateInterest(){
        System.out.println("Current accounts do not earn interest.");
        System.out.println("Overdraft limit RS: "+overdraftLimit);
    }
}

class FixedDepositAccount extends BankAccount{ 
    protected double interestRate = 6.5;
    int yearOfDeposite ;
    FixedDepositAccount(String accountHolderName,String accountNumber,double balance,int yearOfDeposite){
        super(accountHolderName,accountNumber,balance);
        if(yearOfDeposite < 0){
        System.out.println("Deposit term must be positive.");
        System.exit(0);
      }
        this.yearOfDeposite = yearOfDeposite;
    }

    public void  displayAccountDetails(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance RS: "+balance);
        System.out.println("IFSC CODE: "+IFSC_CODE);
    }

    public void  calculateInterest(){
        // (4000000*(4/100))
        double interestOFSaving = ((balance*interestRate*yearOfDeposite)/100);
        System.out.println("Fixed Deposit Interest for 5 years RS: "+interestOFSaving);
    }
}