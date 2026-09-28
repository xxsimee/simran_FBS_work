package com.bankSystem;
import java.util.Date;
public class Transaction {
    private int transactionId;
    private String transactionType;
    private double amount;
    private Date transactionDate;
    private String status;

    // Default Constructor
    public Transaction() {
        super();
    }
    // Parameterized Constructor
    public Transaction(int transactionId,
                       String transactionType,
                       double amount,
                       Date transactionDate,
                       String status) {
        super();
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.status = status;
    }
    // Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    // Display Transaction
    public void displayTransaction() {

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Status: " + status);
    }
}
