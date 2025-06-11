package myproject;

public class Circle {
	private int radius;
	
	void setRad(int radius) {
		this.radius=radius;
	}
	int getRad() {
		return radius;
	}
	void area() {
		double pi=3.14;
		int ar=(int)(pi*radius*radius);
		System.out.println("Area of Circle : "+ar);
		
	}
	void perimeter() {
		double pi=3.14;
		int pr=(int)(2*pi*radius);
		System.out.println("Perimeter of circle : "+pr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle js=new Circle();
		js.setRad(5);
		js.area();
		js.perimeter();
		
		

	}

}
