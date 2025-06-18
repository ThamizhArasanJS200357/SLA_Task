package myproject;

import java.util.*;

public class Contencate {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Size of First Array : ");
		int s1=js.nextInt();
		System.out.println("Enter the Size of Second Array : ");
		int s2=js.nextInt();
		System.out.println("Enter the First Array Element :");
		int arr1[]=new int[s1];
		for(int i=0;i<s1;i++) {
			arr1[i]=js.nextInt();
		}
		System.out.println("Enter the Second Array Element :");
		int arr2[]=new int[s2];
		for(int i=0;i<s2;i++) {
			arr2[i]=js.nextInt();
		}
		ArrayList<Integer>res=new ArrayList<>();
		for(int i=0;i<s1;i++) {
			res.add(arr1[i]);
		}
		for(int i=0;i<s2;i++) {
			res.add(arr2[i]);
		}
		System.out.println("Concatenate of two Array");
		for(int i:res) {
			System.out.print(i+" ");
		}

	}

}
