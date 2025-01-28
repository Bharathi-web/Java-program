package JavaTask;

import java.util.Vector;

public class CountItemsOfVector {
	public static void main(String[] args) {
	Vector v = new Vector();
	v.add(10);
    v.add(20.5);
    v.add(true);
    v.add("Hello World");

    System.out.println("Size of vector collection: " + v.size());
	}

}
