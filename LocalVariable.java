package JavaTask;

import java.util.Scanner;

public class LocalVariable {
	//Creating a method Swap
	void Swap() {
		int a,b,z; //Local Variables (a,b,z)
		System.out.println("Enter the a value:");
		System.out.println("Enter the b value:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The value of a and b before swapping:"+a+" " +b);
		//swapping the two numbers by using the temporary variable z
		z=a;
		a=b;
		b=z;
		System.out.println("The value of a and b after swapping:"+a+" "+b);
		sc.close();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable L=new LocalVariable();
		L.Swap();

	}

}
