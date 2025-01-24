package JavaTask;

import java.util.LinkedList;
import java.util.Queue;

public class CheckStatusInQueue {
	static final int maxSize=5;
	
	public static void checkState(Queue<Integer> q) {
		if(q.isEmpty()) {
			System.out.println("The element is empty");
			}
			else if(q.size()==maxSize) {
				System.out.println("The element in the queue is full");
				
			}
			else {
				System.out.println("The queue element size is "+q.size());
			}
		}
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		checkState(q);
	}

}
