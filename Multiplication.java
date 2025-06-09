package java;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the which table: ");
		int n1=js.nextInt();
		System.out.println("Enter the range of the table: ");
		int n2=js.nextInt();
		multiple(n1,1,n2);
	}
	static void multiple(int table,int c,int i) {
		if(c>i) {
			return;
		}
		System.out.println(c+"x"+table+"="+(c*table));
		multiple(table,c+1,i);
	}

}
