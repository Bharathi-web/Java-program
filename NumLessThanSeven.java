package JavaTask;

import java.util.TreeSet;

public class NumLessThanSeven {

	public static void main(String[] args) {
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(0);
		ts1.add(8);
		ts1.add(9);
		ts1.add(7);
		ts1.add(6);
		ts1.add(4);
		ts1.add(3);
		System.out.println("The TreeSet contains: "+ts1);
		TreeSet<Integer> ts2=(TreeSet<Integer>)ts1.headSet(7);
		System.out.println("The numbers less than 7:");
		for(Integer num:ts2) {
			System.out.print(num+" ");
			
		}

	}

}
