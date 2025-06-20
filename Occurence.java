package myproject;
import java.util.*;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js = new Scanner(System.in);
		int s = js.nextInt();
		int arr[] = new int[s];
		for (int i = 0; i < s; i++) {
			arr[i] = js.nextInt();
		}
		for (int i = 0; i < s; i++) {
			int c = 0;
			int key = arr[i];
			boolean found = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == key) {
					found = true;
					break;
				}
			}
			if (found) continue;
			for (int j = 0; j < s; j++) {
				if (arr[j] == key) {
					c++;
				}
			}
			System.out.println(key + ":" + c);
		}
	}
}
