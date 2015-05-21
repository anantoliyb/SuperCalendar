import java.io.IOException;

public class CalendarApplication {

    public static void main(String[] args){
        InputReader inputReader = new InputReader();

        MonthCalendar monthCalendar = new MonthCalendar(inputReader.getFirstDayOfMonth(args));

        Week week = new Week(monthCalendar.getFirstDaeOfMonth());




        WeekDayType weekDayType = new WeekDayType(WeekDayType.FRIDAY,);
    }
}
