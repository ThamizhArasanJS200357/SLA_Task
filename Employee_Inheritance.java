package myproject;

class Employee{
	public void work() {
		System.out.println("Java Developer");
	}
	public void getSalary() {
		System.out.println("Salary :Rs.50,000");
	}
}

class HRManager{
	public void work() {
		System.out.println("HR Department");
	}
	void addEmployee(String name,String email,String Loc){
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Location : "+Loc);
	}
}

public class Employee_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager js=new HRManager();
		js.work();
		js.addEmployee("Rolex","rolex2003@gmail.com","Chennai");

	}

}
