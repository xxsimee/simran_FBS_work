package com.bankSystem;
public class BankBranch {

    private String bankName;
    private String address;
    private int phoneNumber;
    private String email;
    private String branchName;
    private String ifscCode;
    private Account[] account;
    //private Transaction[] transaction;
    
    // Constructor
    public BankBranch() {
        super();
        bankName = "Laxmi Chit Funds";
        address = "shaitan chauraha lane 4";
        phoneNumber = 1234567890;
        email = "lcf@gmail.com";
        branchName = "Chikhali";
        ifscCode = "lcf0001234";
        account = new Account[10];
        //transaction = new Transaction[50];
    }
    // Add Account
    public void addAccount(Account acc) {

        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = acc;

                System.out.println("Account Added Successfully");
                return;
            }
        }
        System.out.println("Account Array is Full");
    }
    // Find Account
    public Account findAccount(int accountNo) {

        for (int i = 0; i < account.length; i++) {
        	
            if (account[i] != null &&
                account[i].getAccountNo() == accountNo) {
                return account[i];
            }
        }
        return null;
    }
    // Close Account
    public void closeAccount(int accountNo) {
        Account acc = findAccount(accountNo);

        if (acc != null) {
            acc.closeAccount();
            System.out.println( "Account " + accountNo +" closed successfully" );
        } else {
            System.out.println("Account Not Found");
        }
    }
    // End Of Day Report
    public void generateEndOfDayReport() {
        System.out.println("===== END OF DAY REPORT =====");
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null) {
                account[i].displayDetails();
                System.out.println("----------------------------");
            }
        }
    }
    // Total Balance
    public double getTotalBalance() {
        double total = 0;
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null) {
                total = total + account[i].getBalance();
            }
        }
        return total;
    }
    // Getters and Setters
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
}