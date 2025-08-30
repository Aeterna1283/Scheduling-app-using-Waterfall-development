import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Availability
{
//    private List<String> day;
//    private List<Integer> startTime;
//    private List<Integer> endTime;
//    private boolean matched;

    private HashMap<String, ArrayList<Integer>> schedule;

//    public Availability(List<String> aDay, List<Integer> aStartTime, List <Integer> aEndTime, boolean aMatch )
//    {
//        this.day = aDay;
//        this.startTime = aStartTime;
//        this.endTime = aEndTime;
//        this.matched = aMatch;
//    }

    public Availability(HashMap<String, ArrayList<Integer>> schedule)
    {
        this.schedule = new HashMap<>(schedule);
    }


    public HashMap<String, ArrayList<Integer>> getSchedule()
    {
        return schedule;
    }

//    To see if the schedule map is being set up properly
    public void printAvailability()
    {
        for(String day : schedule.keySet())
        {
            System.out.println(day + " : times ->" + schedule.get(day));
        }
    }

//    public boolean avaTime(Availability other)
//    {
//        if(other.day.equals(this.day) && other.startTime.equals(this.startTime))
//        {
//            this.matched = true;
//            return true;
//        }
//        this.matched = false;
//        return false;
//    }


//    public List<String> getDay()
//        {
//            return day;
//        }
//    public List<Integer> getStartTime()
//    {
//        return startTime;
//    }
//    public List<Integer> getEndTime()
//    {
//        return endTime;
//    }
//    public boolean getMatched()
//    {
//        return matched;
//    }
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
