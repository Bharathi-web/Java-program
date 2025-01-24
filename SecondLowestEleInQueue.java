package JavaTask;

import java.util.LinkedList;
import java.util.Queue;

public class SecondLowestEleInQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        Integer secondLowest = findSecondLowest(queue);
        if (secondLowest != null) {
            System.out.println("The second lowest element in the queue is: " + secondLowest);
        } else {
            System.out.println("Queue does not contain enough elements.");
        }
    }

    private static Integer findSecondLowest(Queue<Integer> queue) {
        if (queue.size() < 2) {
            return null;
        }

        Integer min = Integer.MAX_VALUE;
        Integer secondMin = Integer.MAX_VALUE;

        for (Integer num : queue) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }

        return secondMin == Integer.MAX_VALUE ? null : secondMin;

	}

}
