package JavaTask;

import java.util.Scanner;

public class DivisibleByTwoAndFour {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		while(num>0) {
			if(num%2==0 && num%4==0) {
			System.out.println("The number "+num +" is divisible by 2 and 4:");
			}
			else {
				System.out.println("The number "+num +" is not divisible by 2 and 4:");

			}
			break;
			
		}

	}

}
