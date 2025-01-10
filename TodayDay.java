package JavaTask;

import java.util.Calendar;

enum DayOfWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

public class TodayDay {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        DayOfWeek today = DayOfWeek.values()[dayOfWeek - 1]; 
        System.out.println("Today is: " + today);
    }
}