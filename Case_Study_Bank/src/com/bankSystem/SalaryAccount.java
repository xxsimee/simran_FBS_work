package com.bankSystem;
import java.util.Date;

public class SalaryAccount extends SavingsAccount {

    private Date lastTransaction;
    private int inactiveMonths;
    private boolean isFrozen;

    public SalaryAccount(int accountNo, String customerName,
                         double balance, Date openingDate) {

        super(accountNo, customerName, balance, openingDate);

        this.lastTransaction = openingDate;
        this.inactiveMonths = 0;
        this.isFrozen = false;
    }

    public Date getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(Date lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public int getInactiveMonths() {
        return inactiveMonths;
    }

    public void setInactiveMonths(int inactiveMonths) {
        this.inactiveMonths = inactiveMonths;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean isFrozen) {
        this.isFrozen = isFrozen;
    }
    /// Deposit.....
    public void deposit(double amount) {

        if (!isFrozen) {
            super.deposit(amount);

            if (amount > 0) {
                lastTransaction = new Date();
            }
        } else {
            System.out.println("Account is frozen. Deposit is not allowed.");
        }
    }
    // withdraw......
    public boolean withdraw(double amount) {

    	if (!isFrozen) {

            boolean successful = super.withdraw(amount);

            if (successful) {
                lastTransaction = new Date();
            }

            return successful;
        } 
        else {

            System.out.println("Account is frozen. Withdrawal is not allowed.");

            return false;
        }
    }
//// Checking Inactivity of 2 month
    public void checkInactivity() {

        Date today = new Date();

        long difference = today.getTime() - lastTransaction.getTime();

        long days = difference / (1000 * 60 * 60 * 24);

        inactiveMonths = (int) (days / 30);

        if (inactiveMonths >= 2) {
            isFrozen = true;
            setStatus("Frozen");

            System.out.println("Account is frozen due to inactivity.");
            System.out.println("notify the account holder.");
        }
    }
}
