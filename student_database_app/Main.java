import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        Student student = new Student("Tino", "Junior");
        
    }

    public static ArrayList<Student> addStudents(int numOfStudents){
        ArrayList<Student> studentList = new ArrayList<>();
        String studentName;
        String studentYear;
        int numOfCourses;
        ArrayList<String> courseList = new ArrayList<>();

        for (int i = 0; i < numOfStudents; i++){
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentName = scanner.nextLine();

            System.out.println("Enter year of student " + (i + 1) + ": ");
            studentYear = scanner.nextLine();

            System.out.println("Enter number of courses to enroll for student " + (i+1) + ": ");
            numOfCourses = scanner.nextInt();
            //courseList = enrollCourses(numOfCourses);
            //studentList.add(new Student());

        }

        return studentList;

    }

    
    
}
