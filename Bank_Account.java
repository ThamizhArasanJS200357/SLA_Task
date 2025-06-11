package myproject;

import java.math.BigInteger;

public class Bank_Account {
	private BigInteger account;
	private double balance;
	
	void setAcc(BigInteger account) {
		this.account=account;
	}
	BigInteger getAcc() {
		return account;
	}
	
	void setBal(double balance) {
		this.balance=balance;
	}
	double getbal() {
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Account js=new Bank_Account();
		System.out.println("Account details");
		js.setAcc(new BigInteger("346571726168"));
	    js.setBal(50000.75);
	    System.out.println("Account Number: " + js.getAcc());
	    System.out.println("Account Balance: ₹" + js.getbal());

	}

}
