import java.util.Calendar;
import java.util.Date;


public class MonthCalendar {

    private Calendar firstDaeOfMonth;

    MonthCalendar(Calendar firstDaeOfMonth){
        this.firstDaeOfMonth = firstDaeOfMonth;

    }

    public Calendar getFirstDaeOfMonth() {
        return firstDaeOfMonth;
    }

    public void setFirstDaeOfMonth(Calendar firstDaeOfMonth) {
        this.firstDaeOfMonth = firstDaeOfMonth;
    }
}
