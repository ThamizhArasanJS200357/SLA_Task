package myproject;
import java.util.*;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FullRange();
		range();

	}
//	static void FullRange() { // range -2,147,483,648 to 2,147,483,647.
//		System.out.println("By Using Random Class");
//		Random rand=new Random();
//		int num1=rand.nextInt();
//		int num2=rand.nextInt();
//		System.out.println("First Random Number : "+num1);
//		System.out.println("Second Random Number : "+num2);
//	}
	static void range() { // range 0.0 to 1.0.
		System.out.println("By Using Math.random");
		int num1=(int)(Math.random());
		int num2=(int)(Math.random()*1000);
		System.out.println("First Random Number : "+num1);
		System.out.println("Second Random Number : "+num2);
		
	}

}
