package com.index;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 obj=new Task1();
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x=js.nextInt();
		System.out.println("Enter the Second number: ");
		int y=js.nextInt();
		obj.operator(x, y);

	}
	
	void operator(int a,int b) {
		int res=a+b;
		System.out.println("Sum of two number: "+res);
		res=Math.abs(a-b);
		System.out.println("Subtraction of two number: "+res);
		res=a*b;
		System.out.println("Multiplication of two number: "+res);
		if(a>b) {
			res=a/b;
		}
		else {
			res=b/a;
		}
		System.out.println("Divide of two number: "+res);
		res=a%b;
		System.out.println("Modules of two number: "+res);
	}

}
