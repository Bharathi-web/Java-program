package JavaTask;

import java.util.Vector;

public class AllVectorFun {
	 public static void removeRangeCustom(Vector<String> vector, int fromIndex, int toIndex) {
	        for (int i = fromIndex; i < toIndex; i++) {
	            vector.removeElementAt(fromIndex); 
	        }
	    }

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Apple");
		v.add("Orange");
		v.add("Banana");
		v.add("Grapes");
		
		//insertelementAt()
		v.insertElementAt("Mango", 1);
		System.out.println("The vector using insertElementAt(): "+v);
		
		//firstelement()
		System.out.println("The First element present in the vector: "+v.firstElement());
		
		//lastelement()
		System.out.println("The Last element present in the vector: "+v.lastElement());
		
		//removeall()
		v.removeAllElements();
		System.out.println("To remove all the elements in the vector: "+ v);
		
		//remove()
		v.add("Apple");
		v.add("Orange");
		v.add("Banana");
		v.add("Grapes");
		v.remove("Grapes");
		System.out.println("To remove the specific element in the vector: "+v);
		
		//removeelementAt()
		v.removeElementAt(1);
		System.out.println("To remove the specific element based on its index: "+v);
		
		//removeif()
		v.removeIf(e->e.equals("Banana"));
		System.out.println("To remove element if it satisfies the specified condition: "+v);
		
		//removerange()
		v.add("Mango");
		v.add("Orange");
		System.out.println(v);
		removeRangeCustom(v, 0, 2); 
        System.out.println("After custom removeRange(0, 2): " + v);
		
		
	}

}
