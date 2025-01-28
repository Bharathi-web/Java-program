package JavaTask;

import java.util.Vector;

public class CompareTwoVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		Vector<Integer> v2=new Vector<>();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		Vector<Integer> v3=new Vector<>();
		v3.add(1);
		v3.add(2);
		System.out.println("Comparing vector v to v2: " + v.equals(v2));
		System.out.println("Comparing vector v2 to v3: " + v2.equals(v3));

		
	}

}
