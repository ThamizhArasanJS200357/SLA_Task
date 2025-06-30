package myproject;

import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		String st=js.next();
		repeatedchar(st);
	}
	static void repeatedchar(String st) {
		int len=st.length();
		char[]ch=new char[len];
		for(int i=0;i<len;i++) {
			ch[i]=st.charAt(i);
		}
		boolean found=false;
		String ts="";
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					found=true;
					break;
				}
			}
			if(found && ts.indexOf(ch[i])==-1) {
				ts+=ch[i];
				found=false;
			}
		}
		System.out.println(ts);
	}
}
