import java.util.Calendar;
import java.util.Date;

public class WeekDay {

    public static final String RED = "\033[31;1m";
    public static final String YELLOW = "\33[33;1m";
    public static final String CLOSE_COLOR_TOKEN = "\033[0m";
    private final WeekDayType type;
    private Date date;

    public WeekDayType getType() {
        return type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    WeekDay(Date date){
        this.date = date;
        this.type = WeekDayType.findByDate(date);
    }

    @Override
    public String toString(){
        String result = type.isWeekendDay() ? RED : YELLOW;
        result += getDayOfMonth();
        result += CLOSE_COLOR_TOKEN;
        return result;
    }

    private int getDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}
