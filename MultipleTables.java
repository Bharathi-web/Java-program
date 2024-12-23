package JavaTask;

import java.util.Scanner;

public class MultipleTables {

	public static void main(String[] args) {
		int num;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Table:");
		num=sc.nextInt();
		while(i<=10) {
			System.out.println(num+"x"+i+"="+num*i);
			i++;
			
		}

	}

}
