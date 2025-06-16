package myproject;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st=2468;
		int temp=st;
		String ts="";
		while(temp>0) {
			int d=temp%10;
			if(d==2) {
				ts="Two "+ts;
			}
			else if(d==4) {
				ts="four "+ts;
			}
			else if(d==6) {
				ts="six "+ts;
			}
			else if(d==8) {
				ts="eight "+ts;
			}
			temp/=10;
		}
		System.out.println(ts);

	}

}
