package JavaTask;

import java.util.Arrays;

class SortArrayThread extends Thread {
    private int[] arr;
    public SortArrayThread(int[] arr) {
        this.arr = arr;
    }
    public void run() {
        Arrays.sort(arr); 
    }
}
public class SortArrayUsingThread {

	public static void main(String[] args) {
		int[] numbers = {12, 5, 1, 15, 10, 7, 3, 19, 2};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        SortArrayThread sortThread = new SortArrayThread(numbers);
        sortThread.start();

        try {
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

	}

}
