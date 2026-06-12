import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();
        String firstName;
        String lastName;
        int age;
        String supervisorName;
        int choice;

        System.out.println("\n*******************************************************\n");

        do{
            System.out.println("1. Add a student\n2. Remove a student\n3.Search for a student\n4.Display all students\n5.EXIT()");
            System.out.print("Enter your choice of operation: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1: {
                    System.out.print("Enter first name: ");
                    firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    lastName = scanner.nextLine();
                    System.out.print("Enter age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter supervisor name: ");
                    supervisorName = scanner.nextLine();

                    Student newStudent = new GraduateStudent(firstName, lastName, age, supervisorName);
                    system.addStudent(newStudent);

                }
                break;
                case 2: {
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    //system.removeStudent(studentID); to be implemented
                }
                break;

                case 3: {
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    system.searchStudent(studentID);
                }
                break;
                case 4:{
                    system.displayAll();
                }
                break;
                case 5: System.out.println("Good day");
                default: System.out.println("Invalid choice");
            }
        }while (choice != 5);



        
        System.out.println("\n*******************************************************\n");

        scanner.close();
    }
}
