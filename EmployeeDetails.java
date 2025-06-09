package myproject;

public class EmployeeDetails {
	int id;
	String name;
	String location;
	String desigination;
	
	EmployeeDetails(int id,String name,String location,String desigination ){
		this.id=id;
		this.name=name;
		this.location=location;
		this.desigination=desigination;
	}
	private void show() {
		System.out.println(id+" "+name+" "+desigination+" "+location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ID"+" "+"NAME"+" "+"DESIGINATION"+" "+"LOCATION");
		System.out.println();
		EmployeeDetails obj=new EmployeeDetails(101,"Rolex","chennai","HR");
		EmployeeDetails obj1=new EmployeeDetails(102,"JS","Thiruvallur","Senior Manager");
		EmployeeDetails obj2=new EmployeeDetails(103,"Thamizh","Villupuram","Team Leader");
		EmployeeDetails obj3=new EmployeeDetails(104,"Arasan","Anna Nagar","Tester");
		EmployeeDetails obj4=new EmployeeDetails(105,"Sabari","Cuddalore","Java Developer");
		
		obj.show();
		obj1.show();
		obj2.show();
		obj3.show();
		obj4.show();

	}

}
