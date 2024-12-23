package JavaTask;

import java.util.Scanner;

public class ChooseFood {

	public static void main(String[] args) {
		String Food;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the Food Veg or Non-Veg:");
		Food=sc.next();
		Food=Food.toLowerCase();
		switch(Food) {
		
		case "veg":{
			System.out.println("1.Sambar Rice");
			System.out.println("2.Curd Rice");
			System.out.println("3.Veg Fried Rice");
			System.out.println("4.Veg Gravy Rice");
			System.out.println("5.Tomato Rice");
			break;
		}
			
		case "non-veg":{
			System.out.println("1.Chicken Biriyani");
			System.out.println("2.Mutton Biriyani");
			System.out.println("3.Chicken Rice");
			System.out.println("4.Thanthoori");
			System.out.println("5.Fish Fry");
			break;
		}
		default:
			System.out.println("Choose the valid Food either veg or non-veg only");
			break;


			
		}

	}

}
