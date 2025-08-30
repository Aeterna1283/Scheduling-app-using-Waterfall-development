//import java.util.List;
//import java.util.Objects;
//
//public class Availability
//{
//    private List<String> day;
//    private List<Integer> startTime;
//    private List<Integer> endTime;
//    private boolean matched;
//
//    public Availability(List<String> aDay, List<Integer> aStartTime, List <Integer> aEndTime, boolean aMatch )
//    {
//        this.day = aDay;
//        this.startTime = aStartTime;
//        this.endTime = aEndTime;
//        this.matched = aMatch;
//    }
//
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
//
//
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
//        void addAvailability(String time_slots)
//    {
//        availability.add(time_slots);
//    }
//
//    void removeAvailability(String time_slots)
//    {
//        availability.remove(time_slots);
//    }
//}
