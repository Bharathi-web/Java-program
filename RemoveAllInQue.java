package JavaTask;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveAllInQue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Queue before clearing: " + q);
        q.clear();
        System.out.println("Queue after clearing: " + q);

	}

}
