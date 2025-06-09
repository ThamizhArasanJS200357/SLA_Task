package java;

public class RangeEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even :");
		Even(1);
		System.out.println();
		System.out.println("Odd :");
		Odd(1);
	}
	
	static void Even(int i) {
		if(i>100) {
			return;
		}
		if(i%2==0) {
			System.out.print(i+" ");
		}
		Even(i+1);
	}
	static void Odd(int i) {
		if(i>100) {
			return;
		}1
		if(i%2!=0) {
			System.out.print(i+" ");
		}
		Odd(i+1);
	}

}
