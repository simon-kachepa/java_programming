import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        ArrayList<Student> studentList = new ArrayList<>();
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
                System.out.println("ERROR: Choice must be a number");
                scanner.nextLine();
            }

            switch(choice){
                case 1 -> {
                    handleAddStudent(studentList);
                    System.out.println("****************************************\n");
                }
                case 2 -> System.out.println("Remove student");
                case 3 -> System.out.println("Search student");
                case 4 -> System.out.println("Display all students");
                case 5 -> System.out.println("Byee");
                default -> System.out.println("ERROR: Invalid choice");
            }
            System.out.println();
        }while(choice!=5);

        /* 
        handleAddStudent(newList);

        System.out.println(newList.get(0));
        */
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

    public static void handleAddStudent(ArrayList<Student> studentsList){
       try{
                String studentName = getStudentName();
                int studentYear = getStudentYear();
                ArrayList<String> enrolledCourses = courseEnrollment();

                Student newStudent = new Student(studentName, studentYear, enrolledCourses);

                studentsList.add(newStudent);
                System.out.println("\nSUCCESS: Student created successfully");
        }
       catch(IllegalArgumentException e){
        System.out.println("ERROR: Invalid details for new student");
       }
       catch (Exception e){
        System.out.println("ERROR: Could not add a new student");
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
    
    
}
