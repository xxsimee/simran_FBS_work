package com.bankSystem;
import java.util.Date;
public class SavingsAccount extends Account {

    private double minBalance;

    public SavingsAccount(int accountNo, String customerName,
            double balance, Date openingDate) {

        super(accountNo, customerName, balance, openingDate);

        this.minBalance = 10000;
    }
    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
  
    public double calculateInterest() {
        return (getBalance() * 2) / 100;
    }
    // Withdraw
    public boolean withdraw(double amount) {

        if (amount > 0 && getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            return true;
        }
        System.out.println("Withdrawal failed. Minimum balance must be maintained.");
        return false;
    }

    public void displayDetails() {

        System.out.println("Account No      : " + getAccountNo());
        System.out.println("Customer Name   : " + getCustomerName());
        System.out.println("Balance         : " + getBalance());
        System.out.println("Opening Date    : " + getOpeningDate());
        System.out.println("Status          : " + getStatus());
        System.out.println("Minimum Balance : " + getMinBalance());
    }
}
