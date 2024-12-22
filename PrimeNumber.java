package JavaTask;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
			count++;
			}
		}//only by using if condition
		if(count==0) {
			System.out.println("The given number"+" "+a+" "+"is prime");
		}
		

	}

}
