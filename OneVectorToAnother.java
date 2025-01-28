package JavaTask;

import java.util.Vector;

public class OneVectorToAnother {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
        v1.add("Bharathi");
        v1.add("Yoga");
        v1.add("Vasa");
        Vector<String> v2 = new Vector<>();
        v2.add("Vishnu");
        v2.add("Sara");
        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);
        v2.addAll(v1);
        System.out.println("Updated Vector 2 after adding elements from Vector 1: " + v2);
   

	}

}
