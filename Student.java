import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student
{
    private String id;
    private String name;
    private List<String> courses;
    private HashMap<String, ArrayList<Integer>> availability;
//    private List<String> sessions;


    public Student(String a_id, String a_name, List<String> aCourses)
    {
        this.id = a_id;
        this.name = a_name;
        this.courses = new ArrayList<>();
        this.availability = new HashMap<>();
//        this.sessions = new ArrayList<>();
    }

    public String getId()
        {
            return id;
        }

    public String getName()
    {
        return name;
    }

    public List<String> getCourse()
    {
        return courses;
    }

//    public List<String> getAvail()
//    {
//        return availability;
//
//    }

//    public List<String>getSessions()
//    {
//        return sessions;
//    }

    void addCourse(String course)
    {
       courses.add(course);
    }

    void addAvailability(String day, Integer sTime, Integer fTime)
    {
        ArrayList<Integer> hours = new ArrayList<>();
        for (int i = sTime; i < fTime; i++)
        {
            hours.add(i);
        }
        if (availability.containsKey(day))
        {
            ArrayList<Integer> temp = availability.get(day);
            hours.retainAll(temp);
            availability.get(day).addAll(hours);
        } else
        {
            availability.put(day, hours);
        }
    }

    void removeAvailability(String time_slots)
    {
        availability.remove(time_slots);
    }

    void addSession(String sess)
    {
        sessions.add(sess);
    }

}
