package JavaTask;
class Counter {
    private int count = 100;

    // Synchronized method to ensure thread safety
    public synchronized void decrement() {
        if (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + " decremented. Count: " + count);
        }
    }
}


public class DecrementCounterUsingThread {

	public static void main(String[] args) {
		Counter counter = new Counter();

        // Create and start multiple threads
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    counter.decrement();
                    try { Thread.sleep(10); } catch (InterruptedException e) {}
                }
            }).start();
        }
    }


	}


