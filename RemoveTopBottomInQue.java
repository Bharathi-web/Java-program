package JavaTask;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveTopBottomInQue {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        System.out.println("Deque before removing top and bottom: " + deque);
        removeTopBottom(deque);
        System.out.println("Deque after removing top and bottom: " + deque);
    }

    private static void removeTopBottom(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            System.out.println("The deque is empty.");
            return;
        }
        deque.pollFirst();
        if (!deque.isEmpty()) {
            deque.pollLast(); 
        }

	}

}
