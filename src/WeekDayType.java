import java.util.Calendar;

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

    WeekDayType(int id) {
        int title = WeekDayType.getId(id);
        this.id = id;
        this.weekendDay = WeekDayType.;
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
}
