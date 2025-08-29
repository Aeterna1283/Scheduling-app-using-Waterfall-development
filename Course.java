import java.util.ArrayList;
import java.util.List;

public class Course
{
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String cID, String cname)
    {
        this.courseId = cID;
        this.courseName = cname;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId()
    {
        return courseId;
    }

    public String getcourseName()
    {
        return courseName;
    }

    public List<Student> getEnrolledStudents()
    {
        return enrolledStudents;
    }

    void addStudent(Student s)
    {
        enrolledStudents.add(s);
    }
    
    void removeStudent(Student s)
    {
        enrolledStudents.remove(s);
    }

}
