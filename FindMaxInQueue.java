package JavaTask;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxInQueue {
	public static int maxFun(Queue<Integer>q) {
		if(q.isEmpty()) {
			System.out.println("Queue is empty");
		}
		int max=Integer.MIN_VALUE;
		for(int e:q) {
			if(e>max) {
				max=e;
			}
		}
		return max;
			
		
	}
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(40);
		q.add(20);
		q.add(60);
		System.out.println(q);
		int maxValue=maxFun(q);
		System.out.println("The max element is"+maxValue);

		
	}

}
