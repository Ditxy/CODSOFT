package ATM;

import java.util.Scanner;

class BankAccount 
{
 private double balance;

 public BankAccount(double initialBalance) 
 {
     this.balance = initialBalance;
 }

 public double getBalance() 
 {
     return balance;
 }

 public void deposit(double amount) 
 {
     balance += amount;
 }

 public boolean withdraw(double amount) 
 {
     if (balance >= amount) 
     {
         balance -= amount;
         return true;
     } 
     else 
     {
         return false; 
     }
 }
}

public class ATM 
{
 private BankAccount userAccount;

 public ATM(BankAccount account) 
 {
     this.userAccount = account;
 }

 public void displayMenu() 
 {
     System.out.println("ATM Menu:");
     System.out.println("1. Check Balance");
     System.out.println("2. Deposit");
     System.out.println("3. Withdraw");
     System.out.println("4. Exit");
     System.out.print("Please select an option: ");
 }

 public void run() 
 {
     Scanner in = new Scanner(System.in);

     while (true) 
     {
         displayMenu();

         int choice = in.nextInt();

         switch (choice) 
         {
             case 1:
                 checkBalance();
                 break;
             case 2:
                 deposit();
                 break;
             case 3:
                 withdraw();
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 in.close();
                 return;
             default:
                 System.out.println("Invalid option. Please choose a valid option.");
         }
     }
 }

 private void checkBalance() 
 {
     System.out.println("Your balance is: $" + userAccount.getBalance());
 }

 private void deposit() 
 {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the amount to deposit: $");
     double amount = in.nextDouble();

     if (amount > 0) 
     {
         userAccount.deposit(amount);
         System.out.println("Deposit successful. New balance: $" + userAccount.getBalance());
     } else 
     {
         System.out.println("Invalid deposit amount.");
     }
 }

 private void withdraw() 
 {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the amount to withdraw: $");
     double amount = in.nextDouble();

     if (amount > 0) 
     {
         boolean success = userAccount.withdraw(amount);
         if (success) 
         {
             System.out.println("Withdrawal successful. New balance: $" + userAccount.getBalance());
         } else 
         {
             System.out.println("Insufficient balance.");
         }
     } else 
     {
         System.out.println("Invalid withdrawal amount.");
     }
 }

 public static void main(String[] args) 
 {
     BankAccount userAccount = new BankAccount(20000.0); 
     ATM atm = new ATM(userAccount);
     atm.run();
 }
}