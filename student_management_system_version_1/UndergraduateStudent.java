import java.util.ArrayList;
import java.util.List;

public class UndergraduateStudent extends Student {

    private static int numOfUndergradStudents;
    private int numOfEnrolledCourses;
    private String year;
    private List<String> enrolledCourses = new ArrayList<>();

    public UndergraduateStudent(String firstName, String lastName, int age){
        super(firstName, lastName, age);
        setStudentID();
        numOfUndergradStudents++;
    }

    @Override
    public String setStudentID(){
        return String.format("UG-2026-%03d", Student.getNumOfStudents());
    }

    @Override
    public double calculateTuition(){
        double flatRate = 500;
        double coursePrice = 200;

        return (this.numOfEnrolledCourses * coursePrice) + flatRate;
    }

    public static int getNumOfUndergradStudents(){
        return UndergraduateStudent.numOfUndergradStudents;
    }

    @Override
    public String toString(){
        return this.getStudentID() + " " + this.getFirstName() + " " + this.getLastName() + " " + this.getStudentEmail(); 
    }
    
}
