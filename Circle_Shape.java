package myproject;

class Shape{
	public void getArea(int radius) {
		
	}
	public void getperimeter(int radius) {
		
	}
}
class Circle extends Shape{
	double pi=3.14;
	public void getArea(int radius) {
		int c=(int)(pi*radius*radius);
		System.out.println("Area of Circle : "+c);
	}
	public void getperimeter(int radius) {
		int c=(int)(2*pi*radius);
		System.out.println("Perimeter of Circle : "+c);
	}
}

public class Circle_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle js=new Circle();
		js.getArea(5);
		js.getperimeter(5);
	}

}
