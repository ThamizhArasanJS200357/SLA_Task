package myproject;

import java.util.Scanner;

public class RecursionFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=js.nextInt();
		int factorial=fact(num);
		System.out.println("Factorial of Number "+num+" : "+factorial);
		js.close();
	}
	static int fact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*fact(num-1);
	}
	
}
