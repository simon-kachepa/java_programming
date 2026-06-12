import java.util.Scanner;

public class GraduateStudent extends Student{

    Scanner scanner = new Scanner(System.in);
    private String supervisorName;

    public GraduateStudent(String firstName, String lastName, int age, String supervisorName){
        super(firstName, lastName, age);
        setSupervisorName(supervisorName);

    }

    @Override
    public String setStudentID(){
        return String.format("GS-2026-%03d", Student.getNumOfStudents());
    }

    @Override
    public double calculateTuition(){

        return 500;
    }

    public void setSupervisorName(String supervisorName){
        this.supervisorName = supervisorName;
    }

    public String getsupervisorName(){
        return this.supervisorName;
    }

    @Override
    public String toString(){
        return this.getStudentID() + " " + this.getFirstName() + " " + this.getLastName() + " " + this.getStudentEmail(); 
    }
    
}
