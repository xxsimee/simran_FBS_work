class BankAccount {

    int accountNumber;
    String holderName;
    double currentBalance;
    double interestRate;

    BankAccount() {
        super();

        this.accountNumber = 0;
        this.holderName = "Not Given";
        this.currentBalance = 0;
        this.interestRate = 0;
    }

    BankAccount(int accountNumber, String holderName, double currentBalance, double interestRate) {
        super();

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    String getHolderName() {
        return holderName;
    }

    void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    double getCurrentBalance() {
        return currentBalance;
    }

    void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("Current Balance: " + this.currentBalance);
        System.out.println("Interest Rate: " + this.interestRate);
    }

    public String toString() {
        return "Account Number: " + this.accountNumber + "\nHolder Name: " + this.holderName
             + "\nCurrent Balance: " + this.currentBalance + "\nInterest Rate: " + this.interestRate;
    }
}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(101, "Simran", 50000, 4.5);

        ba1.display();

        System.out.println("Hashcode: " + ba1.hashCode());
        System.out.println("\ntoString():");
        System.out.println(ba1);
    }
}