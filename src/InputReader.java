import java.util.Calendar;
import java.util.Date;

public class InputReader {

    public Calendar getFirstDayOfMonth(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        return calendar;
    }

}


