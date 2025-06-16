package myproject;

class BankAccount2
{
	double balance;
	BankAccount2(double initialbal){
		balance=initialbal;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited "+amount+" Successfully!");
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw "+amount+" Successfully");
		}
		else {
			System.out.println("Invalid Withdraw Amount");
		}
	}
}

class SavingAccount extends BankAccount2{
	SavingAccount(double initialamt){
		super(initialamt);
	}
	public void withdraw(double amount) {
		if(amount>0) {
			if(balance-amount>=100.00) {
				balance-=amount;
				System.out.println("Withdraw from Savings : "+"₹"+amount);
			}
			else {
				System.out.println("Withdrawal denied. Minimum balance ₹100 must be maintained.");
			}
		}
		else {
			System.out.println("Invalid Withdraw Amount");
		}
	}
}


public class Bank_Account_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s=new SavingAccount(550.00);
		s.deposit(400.00);
		s.withdraw(200.00);

	}

}
