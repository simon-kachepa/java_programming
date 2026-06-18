package challenge_08;

public class Main {
    public static void main(String[] args){
        
        Student student1 = new Student("Racheal Mika", 202501, 80);
        Student student2 = new Student("Karren Tito", 202502, 63);
        Student student3 = new Student("Prosper Kudzi", 202503, 31);
        Student student4 = new Student("Peter Muta", 202504, 47);

        Student[] students = {student1, student2, student3, student4};
        int studentCount = 1;

        System.out.println("   RollNo\tName\t\tGrade");
        for (Student student : students){
            System.out.print(studentCount++ + ". ");
            student.displayGrade();
        }
    }
}
