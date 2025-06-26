package myproject;

import java.util.Scanner;

public class Pyramid3 {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		int s=js.nextInt();
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
