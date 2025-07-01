package Interface;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		int s=js.nextInt();
		int num=1;
		for(int i=0;i<s;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
