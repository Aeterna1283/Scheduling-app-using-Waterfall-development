import java.util.List;
import java.util.Objects;

public class Availability
{
    private List<String> day;
    private List<String> Time;
//    private String endTime;
    private boolean matched;

    public Availability(List<String> aDay, List<String> aTime,/*String aEndTime,*/ boolean aMatch )
    {
        this.day = aDay;
        this.Time = aTime;
//        this.endTime = aEndTime;
        this.matched = aMatch;
    }

    public boolean avaTime(Availability other)
    {
        if(other.day.equals(this.day) && other.Time.equals(this.Time))
        {
            this.matched = true;
            return true;
        }
        this.matched = false;
        return false;
    }


    public List<String> getDay()
        {
            return day;
        }
    public List<String> getTime()
    {
        return Time;
    }
//    public String getEndTime()
//    {
//        return endTime;
//    }
    public boolean getMatched()
    {
        return matched;
    }
    //    void addAvailability(String time_slots)
//    {
//        availability.add(time_slots);
//    }
//
//    void removeAvailability(String time_slots)
//    {
//        availability.remove(time_slots);
//    }
}
