import java.util.Date;


public class MonthCalendar {

    private Date firstDaeOfMonth;

    MonthCalendar(Date firstDaeOfMonth){
        this.firstDaeOfMonth = firstDaeOfMonth;

    }

    public Date getFirstDaeOfMonth() {
        return firstDaeOfMonth;
    }

    public void setFirstDaeOfMonth(Date firstDaeOfMonth) {
        this.firstDaeOfMonth = firstDaeOfMonth;
    }
}
