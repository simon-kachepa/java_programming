import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        Student newStudent = handleAddStudent();

        System.out.println(newStudent);
        System.out.println(newStudent.getStudentLevel());
        
    }

    public static Student handleAddStudent(){
        String studentName;
        int studentYear;

        System.out.print("Enter student Name: ");
        studentName = scanner.nextLine();

        System.out.println("Choose student Year");
        System.out.println("1. Freshman\n2. Junior\n3. Sophomore\n4. Senior");
        System.out.print("Enter student Year: ");
        studentYear = scanner.nextInt();
        scanner.nextLine();

        return new Student(studentName, studentYear, handleCourseEnrollment());
    }

    public static ArrayList<String> handleCourseEnrollment(){
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
