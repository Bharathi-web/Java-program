package JavaTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueMedian {
	public static double findMedian(Queue<Integer> q) {
		List<Integer> l=new ArrayList<>(q);
		Collections.sort(l);
		int size=l.size();
		if(size%2==1) {
			return l.get(size/2);
		
	}
		else {
		return (l.get(size/2-1)+l.get(size/2))/2.0;
		}
	}

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();	
		q.add(5);
		q.add(4);
		q.add(2);
		q.add(1);
		q.add(3);	
		q.add(7);
		System.out.println("The Median of all the element of a queue is: "+findMedian(q));
		}
}
