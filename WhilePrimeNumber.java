package JavaTask;

import java.util.Scanner;

public class WhilePrimeNumber {

	public static void main(String[] args) {
		int lowerlimit;
		int upperlimit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower limit:");
		lowerlimit=sc.nextInt();
		System.out.println("Enter the Upper limit:");
		upperlimit=sc.nextInt();

		int count=0;
		int i=2;
		while(lowerlimit<=upperlimit) {
			while(i<lowerlimit) {
				if(lowerlimit%i==0){
					count++;
				}
				i++;
			}
			if(count==0) {
				System.out.println(lowerlimit);
			}
			lowerlimit++;
			i=2;
			count=0;
		}
		

	}

}
