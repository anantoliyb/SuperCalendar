import java.util.Date;

public class WorkDay {

    private WeekDayType type;
    private Date date;
    private Week week;

    WorkDay(WeekDayType type, Date date, Week week){
        this.date = date;
        this.type = type;
        this.week = week;
    }

    public WeekDayType getType() {
        return type;
    }

    public void setType(WeekDayType type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    @Override
    public String toString(){
        String color = "";
          if(type.isWeekendDay()){
              color = "\\033[31;1m\t";

          }else{
            color = "\33[33;1m\t";
          }
        return color;
    }
}
