class BankAccount{
	int accountNumber;
	String holderName;
	double balance;
	BankAccount() {
		super();
		this.accountNumber = 0;
		this.holderName = "Not Given";
		this.balance = 0;
	}
	BankAccount(int accountNumber, String holderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
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
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	void display() {
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Holder Name: "+holderName);
		System.out.println("Balance: "+this.balance);
	}
}

class SavingAccount extends BankAccount{
	double interestRate;
	double miniBalance;
	SavingAccount() {
		super();
		this.interestRate = 0;
		this.miniBalance =0;
	}
	SavingAccount(int accountNumber,String holderName,int balance,double interestRate, double miniBalance) {
		super(accountNumber,holderName,balance);
		this.interestRate = interestRate;
		this.miniBalance = miniBalance;
	}
	double getInterestRate() {
		return interestRate;
	}
	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	double getMiniBalance() {
		return miniBalance;
	}
	void setMiniBalance(double miniBalance) {
		this.miniBalance = miniBalance;
	}
	
	void display() {
		super.display();
		System.out.println("Intereset Rate: "+this.interestRate);
		System.out.println("Mini Balance: "+this.miniBalance);
	}
}

class CurrentAccount extends BankAccount{
	double overdraftLimit;
	int transactionLimit;
	CurrentAccount() {
		super();
		this.overdraftLimit =0;
		this.transactionLimit =0;
	}
	CurrentAccount(int accountNumber,String holderName,int balance,double overdraftLimit, int transactionLimit) {
		super(accountNumber,holderName,balance);
		this.overdraftLimit = overdraftLimit;
		this.transactionLimit = transactionLimit;
	}
	double getOverdraftLimit() {
		return overdraftLimit;
	}
	void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	int getTransactionLimit() {
		return transactionLimit;
	}
	void setTransactionLimit(int transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
	void display() {
		super.display();
		System.out.println("Transaction Limit: "+this.transactionLimit);
		System.out.println("Over Draft Limit: "+this.overdraftLimit);
	}
	
}
class BankAccountTest {
	public static void main(String[] args) {
	
	System.out.println("Saving Account:");
	SavingAccount s1=new SavingAccount(110086,"simran",899999,765,765);
	s1.display();
	System.out.println("");
	
	System.out.println("Current Account: ");
	CurrentAccount a1=new CurrentAccount(392374,"rita",8000000,100000,100000);
	a1.display();
}
}
