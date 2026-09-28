package com.bankSystem;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BankBranch bb = new BankBranch();
            System.out.println("Bank Name : " + bb.getBankName());
            System.out.println("IFSC Code : " + bb.getIfscCode());
            System.out.println("address : " + bb.getAddress());

            int ch;
            do {
                System.out.println("\t1. Add Account");
                System.out.println("\t2. Find Account");
                System.out.println("\t3. Close Account");
                System.out.println("\t4. Add Interest ");
                System.out.println("\t5. Repay Loan ");
                System.out.println("\t6. End Of Day Report");
                System.out.println("\t7. Get Total Balance");
                System.out.println("\t8. Exit");

                System.out.print("\tEnter choice: ");
                ch = sc.nextInt();
                switch (ch) {
                case 1: {
                    System.out.println("\t1. Saving Account");
                    System.out.println("\t2. Current Account");
                    System.out.println("\t3. Salary Account");
                    System.out.println("\t4. Loan Account");

                    System.out.print("\tEnter Choice: ");
                    int a = sc.nextInt();

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    if (bb.findAccount(accNo) != null) {
                        System.out.println("Account Number Already Exists");
                        break;
                    }

                    System.out.print("Enter Customer Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Opening Balance: ");
                    double balance = sc.nextDouble();
                    if (a == 1) {
                        System.out.println("Saving Account Selected");
                        SavingsAccount acc = new SavingsAccount(accNo, name, balance, new Date());
                        bb.addAccount(acc);
                    }
                    else if (a == 2) {
                        System.out.println("Current Account Selected");

                        CurrentAccount acc = new CurrentAccount( accNo, name, balance, new Date());

                        bb.addAccount(acc);
                    }
                    else if (a == 3) {
                        System.out.println("Salary Account Selected");
                        SalaryAccount acc = new SalaryAccount( accNo, name, balance, new Date());

                        bb.addAccount(acc);
                    }
                    else if (a == 4) {
                        System.out.println("Loan Account Selected");

                        LoanAccount acc = new LoanAccount(accNo, name, balance, new Date());

                        bb.addAccount(acc);
                    }
                    else {
                        System.out.println("Invalid Choice!");
                    }                    
                    break;
                }
                case 2: {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    Account acc = bb.findAccount(accNo);

                    if (acc != null) {
                        System.out.println("Account Found");
                        acc.displayDetails();

                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    bb.closeAccount(accNo);
                    break;
                }
                case 4: {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    Account acc = bb.findAccount(accNo);

                    if (acc != null) {
                        acc.addInterest();
                    } else {
                        System.out.println("Account Not Found");
                    }

                    break;
                }
                case 5:
                {
                    System.out.print("Enter Loan Account Number: ");
                    int accNo = sc.nextInt();

                    Account acc = bb.findAccount(accNo);

                    if(acc instanceof LoanAccount)
                    {
                        System.out.print("Enter Repayment Amount: ");
                        double amount = sc.nextDouble();

                        ((LoanAccount) acc).repayLoan(amount);
                    }
                    else
                    {
                        System.out.println("Loan Account Not Found");
                    }

                    break;
                }
                case 6: {
                    bb.generateEndOfDayReport();
                    break;
                }
                case 7: {
                    System.out.println( "Total Balance : " + bb.getTotalBalance());
                    break;
                }
                case 8: {

                    System.out.println("Thank You!");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice!");
                }

                }

            } while (ch != 6);
        }
    }
}