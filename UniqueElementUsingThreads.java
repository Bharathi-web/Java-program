package JavaTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueElementThread extends Thread {
    private int[] array;
    private Set<Integer> uniqueElements;
    public UniqueElementThread(int[] array, Set<Integer> uniqueElements) {
        this.array = array;
        this.uniqueElements = uniqueElements;
    }

    @Override
    public void run() {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int num : array) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
         for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            }
        }
    }
}

public class UniqueElementUsingThreads {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 2, 4, 5, 6, 1, 7};
        Set<Integer> uniqueElements = new HashSet<>();
        UniqueElementThread thread = new UniqueElementThread(array, uniqueElements);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (uniqueElements.isEmpty()) {
            System.out.println("No unique elements found.");
        } else {
            System.out.println("Unique elements: " + uniqueElements);
        }

	}

}
