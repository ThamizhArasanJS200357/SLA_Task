package myproject;

import java.util.Scanner;

class BankAccount{
	private String name;
	private int accnum;
	private double balance;
	
	public BankAccount(String name,int accnum,double balance) {
		this.name=name;
		this.accnum=accnum;
		this.balance=balance;
	}
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("₹ "+amt+" deposited Successfully.");
		}
		else {
			System.out.println("Enter the Valid Amount");
		}
	}
	
	public void withdraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance-=amt;
			System.out.println("₹ "+amt+" withdraw Successfully.");
		}
		else {
			System.out.println("Insufficient Amount or Invalid Amount");
		}
	}
	public void getBalance() {
		System.out.println("Current Balance: ₹" + balance);
	}
	public void display() {
		System.out.println("Account Holder : "+name);
		System.out.println("Account Number : "+accnum);
		System.out.println("Balance :₹"+balance);
	}
}

public class BankApp {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		BankAccount account=null;
		int choice;
		
		do {
			System.out.println("------Bank App------");
			System.out.println("1. Create Account ");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance");
			System.out.println("5. View Account Details");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			choice =js.nextInt();
			
			switch(choice) {
			case 1:
				js.nextLine();
				System.out.println("Enter your Account Holder Name : ");
				String name=js.nextLine();
				System.out.println("Enter your Account Number :");
				int accnum=js.nextInt();
				System.out.println("Enter the InitialBalance :");
				double amt=js.nextDouble();
				account =new BankAccount(name,accnum,amt);
				System.out.println("Account created Successfully");
				break;
			case 2:
				if(account!=null) {
					System.out.println("Enter the Deposit Amount");
					double depositamt=js.nextDouble();
					account.deposit(depositamt);
				}
				else {
					System.out.println("Please create an account first");
				}
				break;
			case 3:
				if(account!=null) {
					System.out.println("Enter the Withdraw Amount");
					double withdrawamt=js.nextDouble();
					account.withdraw(withdrawamt);
				}
				else {
					System.out.println("Please create an account first");
				}
				break;
			case 4:
				if(account!=null) {
					account.getBalance();
				}
				else {
					System.out.println("Please create an account first");
				}
				break;
			case 5:
				if(account!=null) {
					account.display();
				}
				else {
					System.out.println("Please create an account first");
				}
				break;
			case 6:
				System.out.println("Thank you for visiting MyBank App");
				break;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		}while(choice!=6);
		
		js.close();
	}

}
