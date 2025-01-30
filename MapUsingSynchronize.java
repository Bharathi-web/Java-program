package JavaTask;

import java.util.HashMap;
import java.util.Map;

public class MapUsingSynchronize { 
	private static final Map<String, Integer> map = new HashMap<>();

// Synchronized method to safely put data into the map
public static synchronized void put(String key, Integer value) {
    map.put(key, value);
    System.out.println(Thread.currentThread().getName() + " added: " + key + " = " + value);
}

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                put("Key" + i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                put("Key" + i, i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Output the final map
        System.out.println("Final map: " + map);

	}

}
