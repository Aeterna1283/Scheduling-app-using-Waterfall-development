import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String id;
    private String name;
    private List<String> courses;
    private Availability availability;
    //private List<String> availability;
    //private List<String> sessions;


    public Student(String a_id, String a_name, List<String> aCourses, Availability theAvailability)
    {
        this.id = a_id;
        this.name = a_name;
        this.courses = new ArrayList<>();
        this.availability = theAvailability;
        //this.availability = new ArrayList<>();
        //this.sessions = new ArrayList<>();
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
//
//    public List<String>getSessions()
//    {
//        return sessions;
//    }

    void addCourse(String course)
    {
       courses.add(course);
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

//    void addSession(String sess)
//    {
//        sessions.add(sess);
//    }

}
