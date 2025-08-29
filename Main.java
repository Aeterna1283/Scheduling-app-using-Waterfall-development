import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Collect Student info to send to student
        System.out.println("Student Name: ");
        String name = sc.nextLine();
        String id = sc.nextLine();
        System.out.println("Student ID: ");
        List<String> courses = new ArrayList<>();
        System.out.println("Enter the courses you want a study buddy for:Example CPSC 3720, CPSC 3220 ");
        String courInput = sc.nextLine();
        String courArray[] = courInput.split(",");
        for(String course : courArray)
        {
            courses.add(course.trim());
        }

        ArrayList<Integer> times = new ArrayList<>();
        Map<String, ArrayList<Integer>> dayNtime = new HashMap<>();
        boolean addTime = true;
        while(addTime) {
            System.out.println("Enter a day you can meet with a study budy: Example Monday");
            String days = sc.nextLine();
            System.out.println("Enter a start and end time to meet with a study buddy by the hour 1 to 24: Example 13 15");
            Integer startTime = sc.nextInt();
            Integer endTime = sc.nextInt();
            System.out.println("Do you want to add another time: Yes or No");
            
        }
  }
}



//BEGIN MAIN
//
//CREATE empty list of Students
//CREATE empty list of Courses
//CREATE empty list of Sessions
//
//LOOP until user chooses Exit
//DISPLAY main menu with options:
//        1. Add Student
//      2. View Student Profile
//      3. Add Course
//      4. Schedule Session
//      5. Save Data
//      6. Exit
//
//GET user choice
//
//IF choice == 1 THEN
//CALL StudentManager.addStudent(students)
//
//ELSE IF choice == 2 THEN
//CALL StudentManager.viewStudentProfile(students)
//
//ELSE IF choice == 3 THEN
//CALL CourseManager.addCourse(courses)
//
//ELSE IF choice == 4 THEN
//CALL SessionManager.scheduleSession(students, courses, sessions)
//
//ELSE IF choice == 5 THEN
//CALL Database.saveStudents(students)
//       (optionally: also save courses/sessions if implemented)
//
//ELSE IF choice == 6 THEN
//DISPLAY "Goodbye!"
//EXIT loop
//
//ELSE
//DISPLAY "Invalid choice. Try again."
//
//END LOOP
//
//END MAIN



