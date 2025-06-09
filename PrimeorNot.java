package java;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		PrimeorNot obj=new PrimeorNot();
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=js.nextInt();
		if(num<=1) {
			System.out.println("It is not a prime");
		}
		else {
			int res=prime(num,2);
			if(res==0) {
				System.out.println("It is a prime");
			}
			else {
				System.out.println("It is not a prime");
			}
		}

	}
	
	static int prime(int n,int i) {
		if(i > n/2) {
			return 0;
		}
		if(n%i==0) {
			return 1;
		}
		return prime(n,i+1);
	}

}
