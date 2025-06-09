package myproject;

import java.util.Scanner;

public class MovieNameShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner js=new Scanner(System.in);
		System.out.println("Enter the Screen in number :");
		int screen=js.nextInt();
		js.nextLine();
		System.out.println("Enter the timing('7-10','10-1'&'1-4')");
		String time=js.nextLine();
		switch(screen) {
		case 1:
			switch(time) {
			case "7-10":
				System.out.println("Dragon");
				break;
			case "10-1":
				System.out.println("Avengers");
				break;
			case "1-4":
				System.out.println("Fast and Furious");
				break;
			default:
				System.out.println("This Time is not available.So please give the available time('7-10','10-1'&'1-4')");
				break;
			}
			break;
		case 2:
			switch(time) {
			case "7-10":
				System.out.println("Captian America");
				break;
			case "10-1":
				System.out.println("Thor");
				break;
			case "1-4":
				System.out.println("Retro");
				break;
			default:
				System.out.println("This Time is not available.So please give the available time('7-10','10-1'&'1-4')");
				break;
			}
			break;
		case 3:
			switch(time) {
			case "7-10":
				System.out.println("Spider Man");
				break;
			case "10-1":
				System.out.println("Deadpool");
				break;
			case "1-4":
				System.out.println("Iron Man");
				break;
			default:
				System.out.println("This Time is not available.So please give the available time('7-10','10-1'&'1-4')");
				break;
			}
			break;
		case 4:
			switch(time) {
			case "7-10":
				System.out.println("Doctor Strange");
				break;
			case "10-1":
				System.out.println("Avatar");
				break;
			case "1-4":
				System.out.println("Loki");
				break;
			default:
				System.out.println("This Time is not available.So please give the available time('7-10','10-1'&'1-4')");
				break;
			}
			break;
		default:
			System.out.println("Only 4 Screen in theater.So Please give the valid screen");
			break;
		}
		js.close();

	}

}
