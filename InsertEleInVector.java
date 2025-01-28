package JavaTask;

import java.util.Vector;

public class InsertEleInVector {
	public static void main(String []args) {
		Vector<String> v=new Vector<>();
		v.add("apple");
		v.add("Mango");
		v.add("Banana");
		System.out.println("The normal vector: "+v);
		
		//Add element into specified index
		v.insertElementAt("Cherry", 2);
		System.out.println("After adding element into index 2: "+v);
	}

}
