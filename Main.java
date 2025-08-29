import javax.swing.JOptionPane;
import javax.swing.*;

class Main {
    public static void main(String[] args) {
        // Welcome message
//        JOptionPane.showMessageDialog(null, "Welcome to the Java Math Quiz!");
//
//        // Ask the user a math question
//        String input = JOptionPane.showInputDialog("What is 7 + 3?");
//
//        try {
//            // Parse the input to an integer
//            int answer = Integer.parseInt(input);
//
//            // Check the answer and respond
//            if (answer == 10) {
//                JOptionPane.showMessageDialog(null, "Correct! Great job!");
//            } else {
//                JOptionPane.showMessageDialog(null, "you are retarded! The correct answer is 10.");
//            }
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
//        }
//
//        // Goodbye message
//        JOptionPane.showMessageDialog(null, "Thanks for playing! Goodbye!");



        JOptionPane.showMessageDialog(null, "This is an info message");
        JOptionPane.showMessageDialog(null, "This is a warning", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is an error", "Error", JOptionPane.ERROR_MESSAGE);


        String name = JOptionPane.showInputDialog("Enter your name:");

        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("User chose YES");
        }

        String[] options = {"Red", "Green", "Blue"};
        int choice1 = JOptionPane.showOptionDialog(null,
                "Pick a color:",
                "Color Picker",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);


        //
        JTextField nameField = new JTextField(10);
        JTextField ageField = new JTextField(5);

        // Put them in a panel
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(Box.createHorizontalStrut(15)); // spacing
        panel.add(new JLabel("Age:"));
        panel.add(ageField);

        // Show dialog with OK / Cancel buttons
        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Enter your info",
                JOptionPane.OK_CANCEL_OPTION
        );

        // Handle result
        if (result == JOptionPane.OK_OPTION) {
            String name1 = nameField.getText();
            String age = ageField.getText();
            JOptionPane.showMessageDialog(null, "Hello " + name1 + ", you are " + age + " years old.");
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



