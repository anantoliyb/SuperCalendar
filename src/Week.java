import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class Week {

    private WeekDay weekDay;

    public Calendar getFirstDaeOfMonth() {
        return firstDaeOfMonth;
    }

    private Calendar firstDaeOfMonth;

    public Week(){
        Date date = new Date();

    }

    ArrayList<WeekDay> list = new ArrayList<WeekDay>();
}
