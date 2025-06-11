package myproject;

public class Employee_Encapsulation {
	private int id;
	private String name;
	private String location;
	
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	String getLoc() {
		return location;
	}
	void setLoc(String location) {
		this.location=location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Encapsulation js=new Employee_Encapsulation();
		System.out.println("Employee Details");
		js.setId(101);
		System.out.println(js.getId());
		js.setName("Rolex");
		System.out.println(js.getName());
		js.setLoc("Chennai");
		System.out.println(js.getLoc());

	}

}
