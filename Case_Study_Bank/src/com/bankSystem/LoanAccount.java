package com.bankSystem;
import java.util.Date;
public class LoanAccount extends Account{
	private double loanAmount;
	private double amountRepaid;
	
	public LoanAccount(int accountNo, String customerName,
            double loanAmount, Date openingDate) {
		super(accountNo, customerName, -loanAmount, openingDate);
		this.loanAmount = loanAmount;
		this.amountRepaid = 0;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAccount) {
		 this.loanAmount = loanAccount;
	}
	public double getAmountRepaid() {
		return amountRepaid;
	}
	public void setAmountRepaid(double amountRepaid) {
		this.amountRepaid = amountRepaid;
	}
	
	// calculate Interest on 6%
	public double calculateInterest() {
	    double interest = (getBalance() * 6) / 100;
	    return interest;
	}
 // repayLoan method
	public void repayLoan(double amount)
	{
		if(amount > 0 && amount <= -getBalance()) {
			amountRepaid= amountRepaid+amount;
			setBalance(getBalance() + amount);
			
			System.out.println("Repayment of Loan Successful.....");
			System.out.println("Remaining Loan Amount:"+(-getBalance()));
		}
		else
		{
			System.out.println("Invalid repayment amount.....");
		}
	}
	public void displayDetails() {
	    System.out.println("Account No      : " + getAccountNo());
	    System.out.println("Customer Name   : " + getCustomerName());
	    System.out.println("Loan Amount     : " + getLoanAmount());
	    System.out.println("Amount Repaid   : " + getAmountRepaid());
	    System.out.println("Balance         : " + getBalance());
	    System.out.println("Opening Date    : " + getOpeningDate());
	    System.out.println("Status          : " + getStatus());
	}
}
