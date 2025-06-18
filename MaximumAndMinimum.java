package myproject;

import java.util.Scanner;

public class MaximumAndMinimum {
	
	static int Maximum(int[]ar) {
		int largest=ar[0];
		for(int i:ar) {
			if(i>largest) {
				largest=i;
			}
		}
		return largest;
	}
	
	static int Minimum(int[]ar) {
		int smallest=ar[0];
		for(int i:ar) {
			if(i<smallest) {
				smallest=i;
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int s=js.nextInt();
		System.out.println("Enter the Element of an Array :");
		int arr[]=new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=js.nextInt();
		}
		int max=Maximum(arr);
		int min=Minimum(arr);
		System.out.println("Maximum number in Array : "+max);
		System.out.println("Minimum number in Array : "+min);

	}

}
