import java.util.ArrayList;

public class StudentRegistry {
    private ArrayList<Student> studentList;

    //StudentRegistry constructor to initialise the list
    public StudentRegistry(){
        this.studentList = new ArrayList<>();
    }

    //Method to handle adding new student to the list
    public void addStudent(Student newStudent){
        if(newStudent == null){
            throw new IllegalArgumentException("ERROR: Student invalid");
        }
        studentList.add(newStudent);
    }

    //Method to handle removing student from the list by ID
    public boolean removeStudent(String studentID){
        return studentList.removeIf(student -> studentID.equals(student.getStudentID()));
    }

    //Method to handle serach student from the student List
    public Student searchStudent(String studentID){
        return studentList.stream()
                .filter(student -> studentID.equals(student.getStudentID()))
                .findAny()
                .orElseThrow(()-> new IllegalArgumentException("Student not found with ID " + studentID));
    }

    // Method to print all students from the student list
    public void displayAllStudents(){
        if (studentList.isEmpty()){
            System.out.println("The student list is empty");
            return;
        }
        studentList.forEach(System.out::println);
    }


}
