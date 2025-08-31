import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MatchMaker
{
    public void checkCourse(Student s1, Student s2) {
        for (String course : s1.getCourse())
        {
            if (s2.getCourse().contains(course))
            {
                checkAvailability(s1,s2);
                return;
            }
        }

    }

    public void checkAvailability(Student s1, Student s2)
    {
        HashMap<String,ArrayList<Integer>> overlap = new HashMap<>();
        for(String day : s1.getAvailability().keySet())
        {
            if(s2.getAvailability().containsKey(day))
            {
                ArrayList<Integer> Times = new ArrayList<>(s1.getAvailability().get(day));
                Times.retainAll(s2.getAvailability().get(day));
                if(!Times.isEmpty())
                {
                  overlap.put(day,Times);
                }
            }
        for(day : overlap.keySet())
        {
            
        }

        }
    }


    //    public List<Student> searchFriends(Student current, Course course)
//    {
//        List<Student> matches = new ArrayList<>();
//
//        for(Student stud : course.getEnrolledStudents())
//        {
//            if (stud != current)
//            {
//                matches.add(stud);
//            }
//
//        }
//        return matches;
//
//    }
//
//    public List<Student> suggestMatches(Student current, Course course)
//    {
//        List<Student> matches = new ArrayList<>();
//
//        for(Student stud : course.getEnrolledStudents())
//        {
//            if(stud != current)
//            {
//                boolean isMatched = false;
//                for(String slot : current.getAvail())
//                {
//                    for(String slot2 : stud.getAvail())
//                    {
//                        if (Objects.equals(slot, slot2))
//                        {
//                            matches.add(stud);
//                            isMatched = true;
//                            break;
//
//                        }
//                    }
//                    if(isMatched)
//                    {
//                        break;
//                    }
//                }
//
//            }
//
//        }
//        return matches;
//
//    }

}
