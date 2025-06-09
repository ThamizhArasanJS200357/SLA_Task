package java;

import java.util.Scanner;

public class ReversetheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int st=js.nextInt();
		int t=st;
		int r=0;
		while(t>0) {
			int d=t%10;
			r=r*10+d;
			t/=10;
		}
		System.out.println("Reverse Number is : "+r);

	}

}
