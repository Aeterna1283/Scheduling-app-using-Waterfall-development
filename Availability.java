public class Availability
{
    private String day;
    private String startTime;
    private String endTime;
    private boolean matched;

    public Availability(String aDay, String aStartTime, String aEndTime, boolean aMatch )
    {
        this.day = aDay;
        this.startTime = aStartTime;
        this.endTime = aEndTime;
        this.matched = aMatch;
    }

    public boolean avaTime(Availability matchDay, Availability matchTime)
    {
        if(matchDay.day == this.day && matchTime.startTime == this.startTime)
        {
            this.matched = true;
            return true;
        }
        this.matched = false;
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
    public boolean getMatched()
    {
        return matched;
    }
}
