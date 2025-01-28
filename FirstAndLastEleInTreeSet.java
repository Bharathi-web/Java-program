package JavaTask;

import java.util.TreeSet;

public class FirstAndLastEleInTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Bharathi");
		ts.add("YogaPriya");
		ts.add("Vasa");
		ts.add("Vishnu");
		ts.add("Kanishka");
		System.out.println("The Full TreeSet: "+ts);
		System.out.println("The First element in the TreeSet is: "+ts.pollFirst());
		System.out.println("The Last element in the TreeSet is: "+ts.pollLast());

	}

}
