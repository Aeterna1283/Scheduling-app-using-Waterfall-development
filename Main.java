import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Documentation will serve as our input handling, lets not wast time with input validation
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
        HashMap<String, ArrayList<Integer>> dayNtime = new HashMap<>();
        boolean addTime = true;
        while(addTime) {
            System.out.println("Enter a day you can meet with a study budy: Example Monday");
            String days = sc.nextLine();
            System.out.println("Enter a start and end time to meet with a study buddy by the hour 0 to 23: Example 13 15");
            Integer startTime = sc.nextInt();
            Integer endTime = sc.nextInt();
            times.add(startTime);
            times.add(endTime);
            dayNtime.put(days,times);
            System.out.println("Do you want to add another time: Yes or No");
            String logic = sc.nextLine();
            if(logic.equalsIgnoreCase("no"))
            {
                addTime = false;
            }
        }

        Availability aSchedule = new Availability(dayNtime);
        Student aProfile1 = new Student(id,name,courses,aSchedule);


        System.out.println("Would any more student like to find a study buddy?: Yes or No");
        String reRun = sc.nextLine();
        if (reRun.equalsIgnoreCase("yes"));
        {
            main(args);
        }
        if(reRun.equalsIgnoreCase("no"))
        {
            System.out.println("BYE!");
            System.exit(0);
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



