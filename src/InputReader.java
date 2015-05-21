import java.util.Calendar;
import java.util.Date;

public class InputReader {

    public Date getFirstDayOfMonth(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

}


