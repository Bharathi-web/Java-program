package JavaTask;

import java.util.Scanner;

public class Eligiblity {

	public static void main(String[] args) {
		String citizenship;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Citizenship:");
		citizenship=sc.nextLine();
		

		if (citizenship.equalsIgnoreCase("Indian") ) {
			System.out.println("Enter the Age:");
			age=sc.nextInt();
			if (age>=18) {
			System.out.println("You are Eligible to Vote");
			}
			else {
				System.out.println("yor are under 18, not eligible to vote");
			}
		}
		else {
			System.out.println("You are not Eligible to vote");
		}
		sc.close();
				

	}

}
