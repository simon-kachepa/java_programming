public class StudentManagementApp {
    public static void main(String[] args){

        StudentManagementSystem system = new StudentManagementSystem();

        Student student1 = new UndergraduateStudent("Tadi", "Mabani", 18);
        Student student2 = new UndergraduateStudent("Kundi", "Kachepa", 17);
        Student student3 = new UndergraduateStudent("Faith", "Chigodo", 18);

        System.out.println("\n*******************************************************\n");
        system.addStudent(student1);
        system.addStudent(student2);
        system.addStudent(student3);

        system.displayAll();

        system.searchStudent("UG-2026-005");
        
        System.out.println("\n*******************************************************\n");


    }
}
