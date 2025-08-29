import java.util.ArrayList;
import java.util.List;

public class Session
{
    private String sessionID;
    private Availability timeSlot;
    List<Student> participants;
    Course course;

    public Session(String sID, Availability ts, Course cs)
    {
        this.sessionID = sID;
        this.timeSlot = ts;
        this.course = cs;
        this.participants = new ArrayList<>();

    }

    public String getSessionID()
    {
        return sessionID;
    }

    public Availability getTimeSlottimeSlot()
    {
        return timeSlot;
    }

    public List<Student> getParticipants()
    {
        return participants;
    }

    public Course getcourse()
    {
        return course;
    }

    void addParticipants(Student s)
    {
        participants.add(s);
    }

    void removeParticipants(Student s)
    {
        participants.remove(s);
    }



}


