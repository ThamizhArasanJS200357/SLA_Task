package myproject;

class PersonEmp{
	int id;
	String name,location,branch,degree;
	
	PersonEmp(int id,String name,String location,String branch,String degree){
		this.id=id;
		this.name=name;
		this.location=location;
		this.branch=branch;
		this.degree=degree;
	}
	void display() {
		if(id>3 && location.equals("south") && degree.equals("engineering")) {
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Location : "+location);
			System.out.println("Branch : "+branch);
			System.out.println("Degree : "+degree);
		}
	}
}

public class Employee_details {
	public static void main(String[] args) {
		PersonEmp [] Emp=new PersonEmp[5];
		Emp[0]=new PersonEmp(3,"Rolex","south","B.E","engineering");
		Emp[1]=new PersonEmp(4,"JS","nouth","B.Sc","Arts");
		Emp[2]=new PersonEmp(5,"Thamizh","south","B.E","engineering");
		Emp[3]=new PersonEmp(6,"Arasan","south","B.Sc","Arts");
		Emp[4]=new PersonEmp(7,"Sabai","south","B.E","engineering");
		
		for(int i=0;i<Emp.length;i++) {
			Emp[i].display();
		}
	}

}
