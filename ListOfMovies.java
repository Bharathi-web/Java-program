package JavaTask;

import java.util.Scanner;

public class ListOfMovies {

	public static void main(String[] args) {
		String actorname=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Actor Name:");
		actorname=sc.nextLine();
		
		switch(actorname) {
		
		case "Rajinikanth":{
			System.out.println("1. Kooli");
			System.out.println("2. Jailer");
			System.out.println("3. Pettai");
			System.out.println("4. Kabali");
			break;
		}
		case "Vijay":{
			System.out.println("1. Goat");
			System.out.println("2. Leo");
			System.out.println("3. Varisu");
			System.out.println("4. Sarkar");
			break;

		}
		case "Ajith":{
			System.out.println("1. Thunivu");
			System.out.println("2. Valimai");
			System.out.println("3. NerkondaParvai");
			System.out.println("4. Vishwasam");
			break;
	}
		default:
			System.out.println("Invalid actor" +" "+ actorname +" "+ "in the given list");

		
		}
		sc.close();

	}

}
