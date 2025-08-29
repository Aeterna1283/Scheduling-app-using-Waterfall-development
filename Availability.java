public class Availability
{
    private String day;
    private String startTime;
    private String endTime;

    public Availability(String aDay, String aStartTime, String aEndTime)
    {
        this.day = aDay;
        this.startTime = aStartTime;
        this.endTime = aEndTime;
    }

    public boolean avaTime(Availability matchDay, Availability matchTime)
    {
        if(matchDay.day == this.day && matchTime.startTime == this.startTime)
        {
            return true;
        }

        return false;
    }
    

    public String getDay()
        {
            return day;
        }
    public String getStartTime()
    {
        return startTime;
    }
    public String getEndTime()
    {
        return endTime;
    }
}
