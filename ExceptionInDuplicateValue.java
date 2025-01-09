package JavaTask;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionInDuplicateValue {

	public static void main(String[] args) {
		int[] a=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 6 array values: ");
		for(int i=0;i<6;i++) {
		a[i]=sc.nextInt();	
		}
		try {
			ArrayList<Integer> duplicates = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && !duplicates.contains(a[i])) {
					duplicates.add(a[i]);
				}
			}
		}
		if(!duplicates.isEmpty()) {
            // Throw exception if duplicates are found
            throw new RuntimeException("Duplicate elements found: " + duplicates);
        } else {
            System.out.println("No duplicates found.");
        }		}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}

	}

}
