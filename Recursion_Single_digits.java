package myproject;

import java.util.Scanner;

public class Recursion_Single_digits {
	
	static int sumofdigits(int num) {
		if(num<10) {
			return num;
		}
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sumofdigits(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=js.nextInt();
		int st=sumofdigits(num);
		System.out.println("Sum of Digits until the number is Single : "+st);
	}

}
