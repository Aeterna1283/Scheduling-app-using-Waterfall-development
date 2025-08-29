import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<Student> suggestMatches(Student current, Course course)
    {
        List<Student> matches = new ArrayList<>();

        for(Student stud : course.getEnrolledStudents())
        {
            if(stud != current)
            {
                boolean isMatched = false;
                for(String slot : current.getAvail())
                {
                    for(String slot2 : stud.getAvail())
                    {
                        if (Objects.equals(slot, slot2))
                        {
                            matches.add(stud);
                            isMatched = true;
                            break;

                        }
                    }
                    if(isMatched)
                    {
                        break;
                    }
                }

            }

        }
        return matches;

    }

}
