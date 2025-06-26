package myproject;
import java.util.*;
public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		int s=js.nextInt();
		int c=1;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
		
	}

}
