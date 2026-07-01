import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        ArrayList<Student> newList = new ArrayList<>();
        handleAddStudent(newList);
        handleAddStudent(newList);

        System.out.println(newList);
        
    }

    public static void handleAddStudent(ArrayList<Student> studentsList){
       try{
                String studentName = getStudentName();
                int studentYear = getStudentYear();
                ArrayList<String> enrolledCourses = courseEnrollment();

                Student newStudent = new Student(studentName, studentYear, enrolledCourses);

                studentsList.add(newStudent);
                System.out.println("\nSUCCESS: Student greated successfully");
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
                System.out.println("Error: Name cannot be empty!");
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
            System.out.println("Choose student Year");
            System.out.println("1. Freshman\n2. Junior\n3. Sophomore\n4. Senior");
            System.out.print("Enter student Year (1 - 4): ");
            if (scanner.hasNextInt()){
                studentYear = scanner.nextInt();
                scanner.nextLine();

                if(studentYear >= 1 && studentYear <= 4){
                    break;
                }
                else{
                    System.out.println("Error: Student Year must be between 1 and 4");
                }
            }
            else{
                System.out.println("Error: Student Year must be a number");
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
                System.out.println("Invalid choice");
            }
        }

        return enrolledCourses;
    }

    
    
}
