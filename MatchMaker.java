import java.util.*;

public class MatchMaker {
    private ArrayList<Student> allStudents = new ArrayList<>();

    public MatchMaker(ArrayList<Student> all)
    {
        this.allStudents = all;
    };

    public void checkCourses() {
        for (int i = 0; i < allStudents.size(); ++i) {
            Student s1 = allStudents.get(i);

            for (int j = i + 1; j < allStudents.size(); ++j) {
                Student s2 = allStudents.get(j);
                for (String course : s1.getCourse()) {
                    if (s2.getCourse().contains(course)) {
                        ArrayList<String> temp = new ArrayList<>(s2.getCourse());
                        temp.retainAll(s1.getCourse());
                        System.out.println(s1.getName() + " and " + s2.getName() + " can study together for " + temp);
                        checkAvailability(s1, s2);
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
            System.out.println("No availability");
        } else {
            for (String print : overlap.keySet()) {
                System.out.println(print + " ->" + overlap.get(print));
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to make a session? Yes or No");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("yes")) {
                System.out.println("Choose a day for a study session from " + overlap.keySet());
                choice = sc.nextLine();
                System.out.println("Choose a starting time from " + choice + ": " + overlap.get(choice));
                Integer ichoice = sc.nextInt();
                s1.addSession(choice, ichoice);
                s2.addSession(choice, ichoice);
                s1.removeAvailability(choice, ichoice, ichoice+1);
                s2.removeAvailability(choice, ichoice, ichoice+1);
                System.out.println("Session made for " + choice + " at " + ichoice + " for " + s1.getName() + " and " +
                        s2.getName());
            }

        }
    }

}
