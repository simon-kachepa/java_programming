import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public Scanner scanner = new Scanner(System.in);
    
    private String studentName;
    private String studentID;
    private String studentYear;
    private ArrayList<String> enrolledCourses;
    private double balance;
    private static int studentNumber;

    public Student(String studentName, String studentYear){
        this.studentName = studentName;
        this.studentYear = studentYear;
        studentNumber++;
        this.balance = calculateTuition();
        this.studentID = generateID();
        this.enrolledCourses = enrollCourses();
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String generateID(){
        return String.format("%s26%02d", this.studentYear.charAt(0), Student.studentNumber);
    }

    public String getStudentID(){
        return this.studentID;
    }
    public ArrayList<String> enrollCourses(){
        ArrayList<String> enrolledCourses = new ArrayList<>();

        System.out.println("Enter number of courses to enroll for "+ this.studentName + ": ");
        int numOfCourses = scanner.nextInt();
        scanner.nextLine();
        while (numOfCourses-- > 0){
            System.out.println("Select courses to enroll");
            System.out.println("1. History 101\n2. Mathematic 101\n3. English 101\n4. Chemistry 101\n5. Computer science 101");
            int courseChoice = scanner.nextInt();
            scanner.nextLine();

            switch(courseChoice){
                case 1 -> enrolledCourses.add("History 101");
                case 2 -> enrolledCourses.add("Mathematic 101");
                case 3 -> enrolledCourses.add("English 101");
                case 4 -> enrolledCourses.add("Chemistry 101");
                case 5 -> enrolledCourses.add("Computer science 101");
                default -> System.out.println("Invalid option");
            }
        }
        return enrolledCourses;
    }

    public double calculateTuition(){
        return (600 * enrolledCourses.size());
    }

    public void payTuition(double amount){
        this.balance -= amount;
    }

    public double viewBalance(){
        return this.balance;
    }
}
