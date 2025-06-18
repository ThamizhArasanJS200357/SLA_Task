package myproject;

import java.util.*;

public class Until_Sum_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=js.nextInt();
		String s=Integer.toString(num);
		int c=0;
		while(s.length()>1) {
			while(num>0) {
				int d=num%10;
				c+=d;
				num/=10;
			}
			num=c;
			s=Integer.toString(num);
			c=0;
		}
		System.out.println("Sum of Digits Until Single digit : "+num);

	}

}
