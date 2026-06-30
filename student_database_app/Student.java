import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public Scanner scanner = new Scanner(System.in);
    
    private String studentName;
    private String studentID;
    private int studentYear;
    private ArrayList<String> enrolledCourses;
    private double balance;
    private static int studentNumber;
    private String studentLevel;

    public Student(String studentName, int studentYear, ArrayList<String> courseList){
        setStudentName(studentName);;
        this.studentYear = studentYear;
        studentNumber++;
        this.studentLevel = getStudentLevel();
       // this.balance = calculateTuition();
        //this.studentID = generateID();
        this.enrolledCourses = courseList;
    }

    //getters and setters to validate user inputs
    public String getName(){
        return this.studentName;
    }
    private void setStudentName(String studentName){
        if(studentName == null || studentName.trim().isEmpty())
        {
            throw new IllegalArgumentException("Invalid name: Student name cannot be empty");
        }
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return this.studentName + " " + this.studentLevel;
    }

    //Getting studentLevel from studentYear;
    public String getStudentLevel(){
        switch(this.studentYear){
            case 1 -> this.studentLevel = "Freshman";
            case 2 -> this.studentLevel = "Sophomore";
            case 3 -> this.studentLevel = "Junior";
            case 4 -> this.studentLevel = "Senior";
            default -> this.studentLevel = "Unknown";
        }
            return this.studentLevel;
    }
    /* 
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
    */
}
