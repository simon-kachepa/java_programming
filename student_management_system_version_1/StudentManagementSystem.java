import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void searchStudent(String studentID){
        System.out.print("\nSearch results: ");
        for (Student student : students){
            if (student.studentID.equals(studentID)){
                System.out.println(student);
                return;
            }
                        
        }
        System.out.println("Student with ID: " + studentID + " not found\n");
    }

    public void displayAll(){
        for (Student student : students){
            System.out.println(student);
        }
    }

}