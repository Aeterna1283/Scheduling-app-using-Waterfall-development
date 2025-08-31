import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MatchMaker
{
    private ArrayList<Student> allStudents = new ArrayList<>();

    public MatchMaker() {};

    public void checkCourses() {
        for (int i = 0; i < allStudents.size(); ++i)
        {
            Student s1 = allStudents.get(i);

            for(int j = i + 1; j < allStudents.size(); ++j)
            {
                Student s2 = allStudents.get(j);

                for(String course : s1.getCourse())
                {
                    if(s2.getCourse().contains(course))
                    {
                        System.out.println(s1.getName() + " and " + s2.getName() + " can study together for " + course);
                        checkAvailability(s1,s2);
                        // avoiding duplicate checks
                        break;
                    }
                }
            }
        }
    }

    public void checkAvailability(Student s1, Student s2)
    {
        System.out.println("Avaiability between " + s1.getName() + " and " + s2.getName());
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
        }
        if(overlap.isEmpty())
        {
            System.out.println("No study buddies available");
        }
        else {
            for (String print : overlap.keySet()) {
                System.out.println(print + " ->" + overlap.get(print));
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
