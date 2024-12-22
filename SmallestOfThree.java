package JavaTask;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value:");
		a=sc.nextInt();
		System.out.println("Enter the b value:");
		b=sc.nextInt();
		System.out.println("Enter the c value:");
		c=sc.nextInt();
		if(a<b && a<c) {
			System.out.println("a is smallest number");
		}
		else if(b<c && b<c) {
			System.out.println("b is smallest number");

		}
		else {
			System.out.println("c is smallest number");

		}

	}

}
