package JavaTask;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		int evennum=0;
		int oddnum=0;
		int i=0;
		while(i<=20) {
			if(i %2 == 0) {
				evennum +=i;
			}
			else {
				oddnum +=i;
			}
			i++;
		}
		System.out.println("The sum of Even numbers between 0 to 20 : "+evennum);
		System.out.println("The sum of Odd numbers between 0 to 20 : "+oddnum);


	}

}
