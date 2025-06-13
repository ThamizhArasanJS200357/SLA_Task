package myproject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=js.nextInt();
		int temp=num;
		int rev=0;
		while(temp>0) {
			int d=temp%10;
			rev=rev*10+d;
			temp/=10;
		}
		if(num==rev) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}

	}

}
