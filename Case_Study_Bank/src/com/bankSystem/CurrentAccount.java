package com.bankSystem;
import java.util.Date;
public class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(int accountNo, String customerName,
            double balance, Date openingDate) {
		super(accountNo, customerName, balance, openingDate);
		this.overdraftLimit = 50000;
       }
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	//Withdraw method ............
	public boolean withdraw(double amount) {

	    if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {

	        setBalance(getBalance() - amount);

	        System.out.println("Amount successfully withdrawn");
	        System.out.println("Remaining Balance: " + getBalance());

	        return true;
	    } 
	    else {

	        System.out.println("Withdraw amount exceeds overdraft limit....");

	        return false;
	    }
	}
	 public double calculateInterest() {
		 //interest calculate one 2% of interest;
		double interest=(getBalance() * 2 /100);
		return interest;
	}
	 public void displayDetails() {

		    System.out.println("Account No      : " + getAccountNo());
		    System.out.println("Customer Name   : " + getCustomerName());
		    System.out.println("Balance         : " + getBalance());
		    System.out.println("Opening Date    : " + getOpeningDate());
		    System.out.println("Status          : " + getStatus());
		    System.out.println("Overdraft Limit : " + getOverdraftLimit());
		}
}
