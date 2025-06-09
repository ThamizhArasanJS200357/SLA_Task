package java;

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
		System.out.println("Enter the radius of circle: ");
		int r=js.nextInt();
		obj.area(r);
		obj.perimeter(r);
		System.out.println("Student Details");
		System.out.println("Enter the roll.no");
		int roll=js.nextInt();
		System.out.println("Enter the name");
		String nam=js.nextLine();
		System.out.println("Enter the Five Subject marks");
		int s1=js.nextInt();
		int s2=js.nextInt();
		int s3=js.nextInt();
		int s4=js.nextInt();
		int s5=js.nextInt();
		
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
	
	void area(int r) {
		float pi=3.14f;
		System.out.println("Area of Circle is: "+(pi*r*r));
	}
	void perimeter(int r) {
		float pi=3.14f;
		System.out.println("Perimeter of Circle is: "+(2*pi*r));
	}
	void student(int rol,String nam,int s1,int s2,int s3,int s4,int s5) {
		System.out.println("Roll Number: "+rol);
		System.out.println("Name :"+nam);
		System.out.println("Subject 1: "+s1);
		System.out.println("Subject 2: "+s2);
		System.out.println("Subject 3: "+s3);
		System.out.println("Subject 4: "+s4);
		System.out.println("Subject 5: "+s5);
		int c=s1+s2+s3+s4+s5;
		c/=2;
		System.out.println("Average of Subject is: "+c);
		
		
	}

}
