package Interface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Setexample { // no duplication will be allowed, unordered, can store null implementation,unable to sort
	                      // set-unique

	public static void main(String[] args) {//Set<String>---typescript-which type of belongs to.
		linkedhashset();
		Hashset();
		treeset();
	}
	public static void Hashset() {
		Set<String>friut=new HashSet<>();
		friut.add("Apple");
		friut.add("Banana");
		friut.add("jack");
		friut.add("mango");
		friut.add("pineapple");
		friut.add("grape");
		Set<String>friut1=new HashSet<>();
		friut1.add("Water melon");
		friut1.add("Banana");
		friut1.add("jack");
		friut.addAll(friut1);
		List<String>sort=new ArrayList<>(friut);
		Collections.sort(sort);
		System.out.println(sort);
		for(String i :friut) {
			System.out.print(i+" ");
		}
		System.out.println();
		friut.retainAll(friut1);
		for(String i :friut) {
			System.out.print(i+" ");
		}
	}
	public static void linkedhashset() {
		Scanner js=new Scanner(System.in);
		int s=js.nextInt();
		Set<String>st=new LinkedHashSet<>();
		for(int i=0;i<s;i++) {
			st.add(js.next());
		}
		int t=js.nextInt();
		Set<String>ts=new LinkedHashSet<>();
		for(int i=0;i<s;i++) {
			ts.add(js.next());
		}
		st.addAll(ts);
		ts.clear();
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("java"));
		st.retainAll(ts);
		System.out.println(st);
	}
	public static void treeset() {
		Scanner js=new Scanner(System.in);
		int s=js.nextInt();
		Set<String>st=new TreeSet<>();
		for(int i=0;i<s;i++) {
			st.add(js.next());
		}
		int t=js.nextInt();
		Set<String>ts=new TreeSet<>();
		for(int i=0;i<s;i++) {
			ts.add(js.next());
		}
		st.addAll(ts);
		ts.clear();
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("java"));
		st.retainAll(ts);
		System.out.println(st);
		
	}
}
