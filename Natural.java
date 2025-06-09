package java;

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Natural obj=new Natural();
		obj.natural(10);
		reverse(10);

	}
	// using recursion
	void natural(int i) {
		if(i==1) {
			System.out.println(1);
		}
		else {
			System.out.println(i);
			natural(i-1);
		}
	}
	// using the if only
	static void reverse(int i) {
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
		if(i>=1) {
			System.out.println(i--);
		}
	}

}
