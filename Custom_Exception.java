package Exception_Learn;

import java.util.Scanner;

public class Custom_Exception {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Age");
		int n=js.nextInt();
		try {
			checkage(n);
		}
		catch(AgeValidException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
	public static void checkage(int n) throws AgeValidException {
		if(n>18 && n<45) {
			System.out.println("Age is valid.");
		}
		else {
			throw new AgeValidException("Age must be above 18 and below 45");
		}
	}
}

class AgeValidException extends Exception{
	AgeValidException(String message){
		super(message);
	}
}
