package JavaTask;

import java.util.Scanner;

public class StaticVariable {
	static int age;
	static String name; //Static Variables
	
	static void Display() {  //static method
		
		System.out.println("The name and age of the person is:"+name+" "+age);
	
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
		age=sc.nextInt();
		System.out.println("Enter the Name:");
		name=sc.next();
		sc.close();
		Display();
		// TODO Auto-generated method stub

	}

}
