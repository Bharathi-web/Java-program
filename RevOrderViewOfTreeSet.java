package JavaTask;

import java.util.Iterator;
import java.util.TreeSet;

public class RevOrderViewOfTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(0);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		System.out.println("The TreeSet: "+ts);
		Iterator<Integer> it=ts.descendingIterator();
		System.out.print("The Reverse order of a TreeSet: ");
		while(it.hasNext()) {
		System.out.print(it.next()+" ");
		}

	}

}
