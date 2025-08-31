import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student
{
    private String id;
    private String name;
    private List<String> courses;
    private HashMap<String, ArrayList<Integer>> availability;
    private HashMap<String, ArrayList<Integer>> sessions;


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
            ArrayList<Integer> temp = new ArrayList<>(availability.get(day));
            hours.retainAll(temp);
            availability.get(day).addAll(hours);
        } else
        {
            availability.put(day, hours);
        }
    }

    void removeAvailability(String day, Integer sTime, Integer fTime)
    {
        ArrayList<Integer> hours = new ArrayList<>();
        for (int i = sTime; i < fTime; i++)
        {
            hours.add(i);
        }
        if (availability.containsKey(day))
        {
            hours.retainAll(availability.get(day));
            if(hours.isEmpty())
            {
                System.out.println("There is no availability to remove for that time.");
                return;
            }
            availability.get(day).removeAll(hours);
        }
        System.out.println("There is no availability on " + day);
        return;
    }

    public HashMap<String, ArrayList<Integer>> getAvailability()
    {
        return availability;
    }

    void removeAvailability(String time_slots)
    {
        availability.remove(time_slots);
    }

    void addSession(String day, Integer sTime)
    {
        {

            if (sessions.containsKey(day))
            {
                if(sessions.get(day).contains(sTime))
                {
                    System.out.println("You Already have a session at that time.");
                    return;
                }
                sessions.get(day).add(sTime);
            } else
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(sTime);
                sessions.put(day, temp);
            }
        }
    }

    void removeSessions(String day, Integer time)
    {
        if (sessions.containsKey(day))
        {
            if(sessions.get(day).contains(time))
            {
                sessions.get(day).remove(time);
                return;
            }
        }
        {
            System.out.println("There is no Session at that time.");
        }
    }

    public HashMap<String, ArrayList<Integer>> getSessions()
    {
        return sessions;
    }


}
