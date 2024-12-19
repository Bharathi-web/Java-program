package JavaTask;

import java.util.Scanner;

public class InstanceVariable {
int first;
int second;
int third; //instance variables

 void Multiple() { //method of instance variables
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the first number value:");
	 System.out.println("Enter the second number value:");
	 first=s.nextInt();
	 second=s.nextInt();
	 int third=first*second;


	 System.out.println("The value of first two numbers after multiple is:"+third);
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable I=new InstanceVariable();
		I.Multiple();

	}

}
