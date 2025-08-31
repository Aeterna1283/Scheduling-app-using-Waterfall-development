import java.util.*;


class Main {
    private static ArrayList<Student> students = new ArrayList<>();


    public static void main(String[] args)
    {
        Student profile = null;
        Scanner sc = new Scanner(System.in);
        Integer menu;
        System.out.println("Welcome to Study Buddy");
        System.out.println("If you want add a new profile please press 1");
        System.out.println("If you want to access an existing prifile press 2");
        System.out.println("If you want to exit press 3");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                //Documentation will serve as our input handling, lets not wast time with input validation
                // Collect Student info to send to student
                System.out.println("Student Name: ");
                String name = sc.nextLine();
                System.out.println("Student ID: ");
                String id = sc.nextLine();
                List<String> courses = new ArrayList<>();
                System.out.println("Enter the courses you want a study buddy for:Example CPSC 3720, CPSC 3220 ");
                String courInput = sc.nextLine();
                String courArray[] = courInput.split(",");
                for(String course : courArray)
                {
                    courses.add(course.trim());
                }

                profile = new Student(id,name,courses);

//                boolean addTime = true;
//                while(addTime) {
//                    System.out.println("Enter a day you can meet with a study budy: Example Monday");
//                    String day = sc.nextLine();
//                    System.out.println("Enter a start and end time to meet with a study buddy by the hour 0 to 23: Example 13 15");
//                    Integer startTime = sc.nextInt();
//                    Integer endTime = sc.nextInt();
//                    sc.nextLine();
//                    profile.addAvailability(day, startTime, endTime);
//                    System.out.println("Do you want to add another time: Yes or No");
//                    String logic = sc.nextLine();
//                    if(logic.equalsIgnoreCase("no"))
//                    {
//                        addTime = false;
//                    }
//                }
                addingAvail(profile);
                students.add(profile);
                break;
            case 2:
                System.out.println("Please enter you student ID");
                String eID = sc.nextLine();

                for(int i = 0; i < students.size(); i++)
                {
                    if(students.get(i).getId().equals(eID)){
                        profile = students.get(i);

                    }
                }

                if (profile == null)
                {
                    System.out.println("There is no student with that ID.");
                    main(args);
                }

                System.out.println(profile.getAvailability());

                System.out.println("Do you want to add availability?");
                String inAns = sc.nextLine();
                if(inAns.equalsIgnoreCase("yes")){
                    addingAvail(profile);
                }

                System.out.println("Do you want to remove availability?");
                inAns = sc.nextLine();
                if(inAns.equalsIgnoreCase("yes"))
                {
                    removeAvail(profile);
                }
                break;
            case 3:
                System.exit(0);
        }


        System.out.println("Do you want to find a sessions?");
        String reRun = sc.nextLine();
        if (reRun.equalsIgnoreCase("no"));
        {
            main(args);
        }
        if(reRun.equalsIgnoreCase("yes"))
        {
            if(students.size() < 2)
            {
                System.out.println("Sorry, no students to match.");
                main(args);
            }
            MatchMaker matches = new MatchMaker(students);


            main(args);
        }
    }

    private static void addingAvail(Student stud) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day you can meet with a study budy: Example Monday");
        String day = sc.nextLine();
        System.out.println("Enter a start and end time to meet with a study buddy by the hour 0 to 23: Example 13 15");
        Integer startTime = sc.nextInt();
        Integer endTime = sc.nextInt();
        sc.nextLine();
        stud.addAvailability(day, startTime, endTime);
        System.out.println("Do you want to add another time: Yes or No");
        String logic = sc.nextLine();
        if(logic.equalsIgnoreCase("no"))
        {
            return;
        }
        addingAvail(stud);

    }

    private static void removeAvail(Student stud){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day you want to remove time availability from: Example Monday");
        String day = sc.nextLine();
        System.out.println("Enter a start and end time to remove 0 to 23: Example 13 15");
        Integer startTime = sc.nextInt();
        Integer endTime = sc.nextInt();
        sc.nextLine();
        stud.removeAvailability(day, startTime, endTime);
        System.out.println("Do you want to remove another time: Yes or No");
        String logic = sc.nextLine();
        if(logic.equalsIgnoreCase("no"))
        {
            return;
        }
        removeAvail(stud);
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



