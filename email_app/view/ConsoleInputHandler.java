package view;

import java.util.Scanner;

import model.Department;

public class ConsoleInputHandler {

    private final Scanner scanner = new Scanner(System.in);

    public void displayWelcomeMessage(){
        System.out.println("\n*******************************************************************\n");
        System.out.println("\t EMAIL MANAGEMENT APP");
        System.out.println("\n*******************************************************************");
    }

    public void displayMenu(){
        System.out.println("""
                \n-- SELECT OPERATION --
                1. Create new Email
                2. Change Passwort
                3. Set Mailbox Capacity
                4. Set altinate Email
                5. Display Email
                6. Display Employee Info
                7. Display Mailbox Capacity
                8. Display All Emails
                9. Exit()
                """);
    }

    public void displayDepartments(){
        System.out.println("SELECT DEPARTMENT CODE: ");
        for(Department department : Department.values()){
            System.out.println(department.getDepartmentCode() + ". " + department);
        }
    }

    public int readDepartmentCode(){
        System.out.print("Enter your department code (1 - " + Department.values().length + "): ");
        if(scanner.hasNextInt()){
            int code = scanner.nextInt();
            scanner.nextLine();
            return code;
        }
        else{
            System.out.println("ERROR: Department code must be a number");
            scanner.nextLine();
            return -1;
        }   
    }

    public int readUserChoice(){
        System.out.print("\nENTER YOUR COICE (1 - 9): ");
            if(scanner.hasNextInt()){
                int choice = scanner.nextInt();
                scanner.nextLine();
                return choice;
            }
            else{
                System.out.println("ERROR: Choice must be a number");
                scanner.nextLine();
                return -1;
            }
    }
    
}
