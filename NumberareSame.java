package java;

import java.util.Scanner;

public class NumberareSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the First Floating Number :");
		float st=js.nextFloat();
		System.out.println("Enter the Second Floating Number :");
		float ts=js.nextFloat();
		int n1=(int)(st*100);
		int n2=(int)(ts*100);
		if(n1==n2) {
			System.out.println("The numbers are same");
		}
		else {
			System.out.println("The numbers are different");
		}
	}

}
