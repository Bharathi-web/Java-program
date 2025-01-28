package JavaTask;
class EvenThread extends Thread{
	public void run() {
		for(int i=2;i<=20;i+=2) {
			System.out.println("Even: "+i);
		}
		
	}
	
}
class OddThread extends Thread{
	public void run() {
		for(int i=1;i<=20;i+=2) {
			System.out.println("Odd: "+i);
		}
		
	}
	
}

public class EvenAndOddUsingThread {

	public static void main(String[] args) {
		EvenThread even=new EvenThread();
		OddThread odd=new OddThread();
		even.start();
		odd.start();
		try {
            // Wait for both threads to finish
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		

	}

}
