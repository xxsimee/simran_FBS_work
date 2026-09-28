package com.bankSystem;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public abstract class Account {
    private int accountNo;
    private String customerName;
    private double balance;
    private Date openingDate;
    private String status;
   
    private List<Transaction> transaction = new ArrayList<>();
    // Default Constructor
    public Account() {
        super();
        this.status = "Active";
    }
    // Parameterized Constructor
    public Account(int accountNo, String customerName,
                   double balance, Date openingDate) {
        super();
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
        this.openingDate = openingDate;
        this.status = "Active";
    }
    // Getters and Setters
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Date getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    // Deposit
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;

            transaction.add( new Transaction( transaction.size() + 1, "Deposit",amount,new Date(), "Success" ));

            System.out.println("Amount Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } 
        else {
            System.out.println("Invalid Amount");
        }
    }
    // Withdraw
    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;

            transaction.add(
                new Transaction(
                    transaction.size() + 1,
                    "Withdraw",
                    amount,
                    new Date(),
                    "Success"
                )
            );
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } 
        else {
            System.out.println("Insufficient Balance");
        }
		return false;
    }

    // Abstract methods
    public abstract double calculateInterest();

    public abstract void displayDetails();
    // Open Account
    public void openAccount() {
        status = "Active";
        System.out.println("Account Opened Successfully");
    }
    // Close Account
    public void closeAccount() {
        status = "Closed";
        System.out.println("Account Closed Successfully");
    }
    // Check Status
    public void checkStatus() {
        System.out.println("Account Status: " + status);
    }
    //add Interest
    public void addInterest() {
        double interest = calculateInterest();
        balance = balance + interest;

        System.out.println("Interest Added: " + interest);
        System.out.println("New Balance: " + balance);
    }
    // Transaction List
    public List<Transaction> getTransaction() {
        return transaction;
    }
}