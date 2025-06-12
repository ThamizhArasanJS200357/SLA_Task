package myproject;

public class Constructor_Overloading {
	
	private int id;
	private String loc;
	private String desi;
	
	Constructor_Overloading(int id){
		this.id=id;
	}
	
	Constructor_Overloading(int id,String loc){
		this.id=id;
		this.loc=loc;
	}
	
	Constructor_Overloading(int id,String loc,String desi){
		this.id=id;
		this.loc=loc;
		this.desi=desi;
	}
	
	void show() {
		System.out.println("Employee Details");
		System.out.println("ID : "+id);
		System.out.println("Location : "+loc);
		System.out.println("Desigination : "+desi);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Overloading js=new Constructor_Overloading(4041);
		Constructor_Overloading st=new Constructor_Overloading(4042,"Rolex");
		Constructor_Overloading ts=new Constructor_Overloading(4043,"JS","Java Developer");
		js.show();
		st.show();
		ts.show();
		

	}

}
