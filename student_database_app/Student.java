import java.io.Serializable;
import java.util.ArrayList;


public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String studentName;
    private String studentID;
    private int studentYear;
    private StudentLevel studentLevel;
    private ArrayList<String> enrolledCourses;
    private double balance;
    private static int studentNumber;

    public Student(String studentName, int studentYear, ArrayList<String> courseList){
        setStudentName(studentName);
        setStudentYear(studentYear);
        setStudentLevel(studentYear);
        studentNumber++;
        this.enrolledCourses = courseList;
        setBalance();
        this.studentID = generateStudentID();
    }

    //getters and setters for student name to validate user inputs
    public String getName(){
        return this.studentName;
    }
    private void setStudentName(String studentName){
        if(studentName == null || studentName.trim().isEmpty())
        {
            throw new IllegalArgumentException("ERROR: Invalid name. Student name cannot be empty");
        }
        this.studentName = studentName;
    }

    //getter and setter for student year to validate it
    public int getStudentYear(){
        return this.studentYear;
    }
    private void setStudentYear(int studentYear){
        if (studentYear < 1 || studentYear > 4){
            throw new IllegalArgumentException("ERROR: Invalid student year. Student year must be between 1 and 4");
        }

        this.studentYear = studentYear;
    }

    //Getter and setter for student Level
    private void setStudentLevel(int studentYear){
        this.studentLevel = StudentLevel.fromStudentYear(studentYear);
    }
    public StudentLevel getStudentLevel(){
        return this.studentLevel;
    }
    

    @Override
    public String toString(){
        return this.studentID + "\t" + this.studentName + "\t" + this.studentLevel;
    }

    private String generateStudentID(){
        //String studentLevel = this.studentLevel;
        return String.format("R%d%02d",
                                            this.studentYear,
                                            Student.studentNumber + 1000);
    }

    public String getStudentID(){
        return this.studentID;
    }
    public ArrayList<String> getEnrolledCourses(){
        
        return enrolledCourses;
    }

    private void setBalance(){
        this.balance =  (600 * this.enrolledCourses.size());
    }

    public void payTuition(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("ERROR: You cannot pay negative(-) amount");
        }
        this.balance -= amount;
        StudentRegistry.setHasChanges(true);
    }

    public String viewBalance(){
        return String.format("$%.2f",this.balance);
    }
}
