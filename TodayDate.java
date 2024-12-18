package JavaProgram;

import java.util.Calendar;

public class TodayDate {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();

        // Print the current date
        System.out.println("Current Date: " + c.getTime());
        c.add(Calendar.YEAR, 4); 
        System.out.println("Four years later: " + c.getTime());

		
	}
 
}
