import sun.plugin.dom.exception.InvalidStateException;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by employee on 5/20/15.
 */
public enum WeekDayType {
    MONDAY("Mon", Calendar.MONDAY, false),
    TUESDAY("Tue", Calendar.TUESDAY, false),
    WEDNESDAY("Wed", Calendar.WEDNESDAY, false),
    THURSDAY("Thu", Calendar.THURSDAY, false ),
    FRIDAY("Fri",Calendar.FRIDAY, false),
    SATURDAY("Sat", Calendar.SATURDAY, true),
    SUNDAY("Sun", Calendar.SUNDAY, true);


    private String title;
    private int id;
    private boolean weekendDay;

    WeekDayType(String title, int id, boolean weekendDay) {
        this.title = title;
        this.id = id;
        this.weekendDay = weekendDay;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public boolean isWeekendDay() {
        return weekendDay;
    }

    public static WeekDayType findByDate(Date date) {
        for (WeekDayType weekDayType : values()) {
            if (weekDayType.isSameWeekDay(date))
                return weekDayType;
        }
        throw new InvalidStateException("Not incorrect week days listed in enum WeekDayType");
    }

    private boolean isSameWeekDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(Calendar.DAY_OF_WEEK) == getId());
    }
}
