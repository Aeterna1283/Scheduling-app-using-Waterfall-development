import java.util.ArrayList;
import java.util.List;

public class MatchMaker
{
    public List<Student> searchFriends(Student current, Course course)
    {
        List<Student> matches = new ArrayList<>();

        for(Student stud : course.getEnrolledStudents())
        {
            if (stud != current)
            {
                matches.add(stud);
            }

        }
        return matches;



    }
}
