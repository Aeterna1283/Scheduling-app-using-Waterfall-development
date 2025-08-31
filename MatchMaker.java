import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MatchMaker {
    private ArrayList<Student> allStudents = new ArrayList<>();

    public MatchMaker(ArrayList<Student> all)
    {
        this.allStudents = all;
        System.out.println("1");
    };

    public void checkCourses() {
        System.out.println("2");
        for (int i = 0; i < allStudents.size(); ++i) {
            Student s1 = allStudents.get(i);

            for (int j = i + 1; j < allStudents.size(); ++j) {
                Student s2 = allStudents.get(j);
                System.out.println("3");
                for (String course : s1.getCourse()) {
                    System.out.println("4");
                    if (s2.getCourse().contains(course)) {
                        System.out.println(s1.getName() + " and " + s2.getName() + " can study together for " + course);
                        checkAvailability(s1, s2);
                        System.out.println("5");
                        // avoiding duplicate checks
                        break;
                    }
                }
            }
        }
    }

    public void checkAvailability(Student s1, Student s2) {
        System.out.println("Availability between " + s1.getName() + " and " + s2.getName());
        HashMap<String, ArrayList<Integer>> overlap = new HashMap<>();
        for (String day : s1.getAvailability().keySet()) {
            if (s2.getAvailability().containsKey(day)) {
                ArrayList<Integer> Times = new ArrayList<>(s1.getAvailability().get(day));
                Times.retainAll(s2.getAvailability().get(day));
                if (!Times.isEmpty()) {
                    overlap.put(day, Times);
                }
            }
        }
        if (overlap.isEmpty()) {
            System.out.println("No study buddies available");
        } else {
            for (String print : overlap.keySet()) {
                System.out.println(print + " ->" + overlap.get(print));
            }
        }
    }

}
