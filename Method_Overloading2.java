package myproject;

public class Method_Overloading2 {
	public void print(int id ,String name) {
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
	}
	public void print(String loc,int age) {
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Location : "+loc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading2 js=new Method_Overloading2();
		js.print(101,"Rolex");
		js.print("Chennai", 21);

	}

}
