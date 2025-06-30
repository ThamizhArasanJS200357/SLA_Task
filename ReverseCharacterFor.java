package myproject;

import java.util.Scanner;

public class ReverseCharacterFor {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		int s=js.nextInt();
		char[]st=new char[s];
		for(int i=0;i<s;i++) {
			st[i]=js.next().charAt(0);
		}
		System.out.println("Reverse Character Using the For Loop");
		reversefor(st ,s);
		System.out.println();
		System.out.println("Reverse Character Using the While Loop");
		reversewhile(st,s);
		System.out.println();
		System.out.println("Reverse Character Using the Recursion");
		reverserecursion(st,s);
	}
	static void reversefor(char []ch ,int s) {
		for(int i=s-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
	}
	static void reversewhile(char[]ch,int s) {
		int i=s-1;
		while(i>=0) {
			System.out.print(ch[i]+" ");
			i--;
		}
	}
	static void reverserecursion(char[]ch,int s) {
		int i=s-1;
		if(i<0) {
			return;
		}
		else {
			System.out.print(ch[i]+" ");
			reverserecursion(ch,i);
		}
	}

}
