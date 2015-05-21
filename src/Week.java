import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public class Week {

    public Date getFirstDaeOfMonth() {
        return firstDaeOfMonth;
    }

    private Date firstDaeOfMonth;
    public Week(Date firstDaeOfMonth){
        this.firstDaeOfMonth = firstDaeOfMonth;

        System.out.println(initCalendar());
    }

    ArrayList<WorkDay> list = new ArrayList<WorkDay>();

    public Calendar initCalendar(){
        int year = getFirstDaeOfMonth().getYear();
        int month = getFirstDaeOfMonth().getMonth();
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        calendar.set(year, month, 1);
        System.out.println(calendar.get(Calendar.YEAR) +" " +calendar.get(Calendar.MONTH) +" " +calendar.get(Calendar.DAY_OF_MONTH) );
        return calendar;
    }





}
