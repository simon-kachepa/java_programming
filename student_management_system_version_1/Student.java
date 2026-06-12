import java.util.Scanner;

public abstract class Student {

    Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private int age;
    private int year = 2026;
    private static int numOfStudents;
    private String studentEmail;
    public String studentID;

    Student(String firstName, String lastName, int age){
        setFirstName(firstName);
        setlastName(lastName);
        setAge(age);
        setStudentEmail();
        this.studentID = setStudentID();
        numOfStudents++;
    }
    //declaring our abstract method of calculating tuition and student IDs
    public abstract String setStudentID();
    public String getStudentID(){
        return this.studentID;
    }

    public abstract double calculateTuition();

    // implementing setters methods to set our defined fields. They are set as private to prevent changing student details after creation;
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private void setlastName(String lastName){
       this.lastName = lastName;
    }

    private void setAge(int age){
        if (age < 16){
            System.out.println("Age must be above 16\n");
        }
        else {
            this.age = age;
        }
    }

    private void setStudentEmail(){
        this.studentEmail = this.lastName.toLowerCase()+ this.firstName.toLowerCase() + "@university.edu";
    }

    //implementing getters to get the firstName, lastName, age and numberOfStudents

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getStudentEmail(){
        return this.studentEmail;
    }
    public static int getNumOfStudents(){
        return Student.numOfStudents;
    }

    public String getStudentID(String studentID){
        return studentID;
    }

    public int getYear(int year){
        return this.year;
    }
    
}
