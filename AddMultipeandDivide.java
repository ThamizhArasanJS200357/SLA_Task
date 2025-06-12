package myproject;

public class AddMultipeandDivide {
	static int a=10;
	static int b=5;
	int c=0;
	
	static void add() {
		System.out.println("Addition of Number is : "+(a+b));
	}
	static void mul() {
		System.out.println("Multiplication of Number is : "+(a*b));
	}
	 void div() {
		if(a>b) {
			c=a/b;
			System.out.println("Divition of Number is : "+c);
		}
		else {
			c=b/a;
			System.out.println("Divition of Number is : "+c);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddMultipeandDivide js=new AddMultipeandDivide();
		add();
		mul();
		js.div();

	}

}
