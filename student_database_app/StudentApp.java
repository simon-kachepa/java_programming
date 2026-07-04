import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        StudentRegistry studentRegistry = new StudentRegistry();
        int choice = 0;

        System.out.println("\n*******************************************************************************************\n");
        System.out.println("\t WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("\n*******************************************************************************************\n");
        
        
        do{
            System.out.println("-- SELECT OPERATION --\n");
            displayMenu();
            System.out.print("ENTER YOUR CHOICE: ");
            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            else{
                System.out.println("\nERROR: Choice must be a number\n");
                scanner.nextLine();
                continue;
            }

            switch(choice){
                case 1 -> {
                    handleAddStudent(studentRegistry);
                    System.out.println("****************************************\n");
                }
                case 2 -> {
                    handleRemoveStudent(studentRegistry);
                    System.out.println("****************************************\n");

                }
                case 3 -> {
                    handleSearchStudent(studentRegistry);
                    System.out.println("****************************************\n");
                }
                case 4 -> {
                    handleDisplayStudents(studentRegistry);
                    System.out.println("****************************************\n");
                }
                case 5 -> System.out.println("-- UNTIL NEXT TIME --");
                default -> System.out.println("ERROR: INVALID CHOICE\n");
            }
            System.out.println();
        }while(choice!=5);


        System.out.println("\n*******************************************************************************************\n");
    }

    public static void displayMenu(){
        System.out.println("""
                1. Add Student\n
                2. Remove Student\n
                3. Search Student\n
                4. Display all Student\n
                5. Exit()
                """);
    }

    //creating student from console
    public static Student createStudentFromConsole(){
        try{
            String studentName = getStudentName();
            int studentYear = getStudentYear();
            ArrayList<String> enrolledCourses = courseEnrollment();

            return new Student(studentName, studentYear, enrolledCourses);
    }
   catch(IllegalArgumentException e){
    System.out.println("ERROR: Invalid details for new student");
    return null;
   }
   catch (Exception e){
    System.out.println("ERROR: Could not add a new student");
    return null;
   }

    }

    //adding the new student to the list
    public static void handleAddStudent(StudentRegistry studentsList){
        Student newStudent = createStudentFromConsole();
        if (newStudent != null){
            try{
                    studentsList.addStudent(newStudent);
                    System.out.println("\nSUCCESS: Student added to registry successfully");
                }
            catch(IllegalArgumentException e){
                System.out.println("ERROR: Could not add the student to registry");
            }
        }

        
    }

    //Getting new student name and validating it to enroll the student
    public static String getStudentName(){
        String studentName = "";

        while(true){
            System.out.print("Enter first name: ");
            studentName = scanner.nextLine().trim();

            if (studentName.isEmpty()){
                System.out.println("ERROR: Name cannot be empty!");
            }
            else{
                break;
            }
        }
        return studentName;
    }

    //Getting student year and validate it
    public static int getStudentYear(){
        int studentYear;

        while(true){
            StudentLevel studentLevels = StudentLevel.FRESHMAN;

            System.out.println("Choose student Year");
            studentLevels.displayLevels();
            System.out.print("Enter student Year (1 - 4): ");
            if (scanner.hasNextInt()){
                studentYear = scanner.nextInt();
                scanner.nextLine();

                if(studentYear >= 1 && studentYear <= 4){
                    break;
                }
                else{
                    System.out.println("ERROR: Student Year must be between 1 and 4");
                }
            }
            else{
                System.out.println("ERROR: Student Year must be a number");
                scanner.nextLine();
            }
        }

        return studentYear;
    }

    //Getting enrolled corses by a new student
    public static ArrayList<String> courseEnrollment(){
        ArrayList<String> availableCourses = new ArrayList<>(List.of("History 101", "Mathematic 101", "English 101", "Chemistry 101", "Computer science 101"));
        ArrayList<String> enrolledCourses = new ArrayList<>();

        System.out.print("Enter number of courses to enroll: ");
        int numOfCourses = scanner.nextInt();
        scanner.nextLine();

        while (numOfCourses-- > 0){
            System.out.println("Select course to enroll");
            int i = 0;
            for (String course : availableCourses){
                System.out.println(++i + ". " + course);
            }
            System.out.print("Enter your course choise: ");
            int courseChoice = scanner.nextInt();
            scanner.nextLine();

            if(courseChoice > 0 && courseChoice <= availableCourses.size()){
                enrolledCourses.add(availableCourses.get(courseChoice - 1));
                availableCourses.remove(courseChoice - 1);
            }
            else{
                System.out.println("ERROR: Invalid choice");
            }
        }

        return enrolledCourses;
    }

    //Method to handle removing of student by ID from the student list
    public static void handleRemoveStudent(StudentRegistry studentRegistry){

        String studentID = "";

        System.out.print("Enter ID for the student you want to remove: ");
        studentID = scanner.nextLine();
        
        try {
            studentRegistry.removeStudent(studentID);
            System.out.println("Student with ID: " + studentID + " removed successfully");
        }
        catch(IllegalArgumentException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    //Method to handle search student using the ID
    public static void handleSearchStudent(StudentRegistry studentRegistry){

        String studentID = "";

        System.out.print("Enter ID for the student you want to search: ");
        studentID = scanner.nextLine();
        try{
            Student student = studentRegistry.searchStudent(studentID);
            System.out.println(student);
        }
        catch(IllegalArgumentException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    //Method to handle the display of students
    public static void handleDisplayStudents(StudentRegistry studentRegistry){
        studentRegistry.displayAllStudents();
    }
    
}
