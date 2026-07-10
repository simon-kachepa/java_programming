import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice = 0;
        boolean exit = false;

        System.out.println("\n*******************************************************************\n");
        System.out.println("\t EMAIL MANAGEMENT APP");
        System.out.println("\n*******************************************************************");
        
        while(!exit){
            System.out.println("\nSELECT OPERATION");
            displayMenu();
            System.out.print("Enter your choice (1 - 9): ");
            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            else{
                System.out.println("ERROR: Choice must be a number");
                scanner.nextLine();
            }
            switch(choice){
                case 1 -> System.out.println("Create new email");
                case 2 -> System.out.println("Change Passwort");
                case 3 -> System.out.println("Set Mailbox Capacity");
                case 4 -> System.out.println("Set altinate Email");
                case 5 -> System.out.println("Display Email");
                case 6 -> System.out.println("Display Name");
                case 7 -> System.out.println("Display Mailbox Capacity");
                case 8 -> System.out.println("Display All Emails");
                case 9 -> exit = true;
                default -> System.out.println("ERROR: Choice must be between 1 and 9");
            } 

        }

        //Display menu
            //1. Create new email
            //2. Display emails
            //3. Get email
            //4. Get Name
            //5. Set Altenative Email
            //6. Set Limit
        //Accept user choice
        //Process user choice

        //Additional Work -> Save created emails to a file
        //Validate all the inputs

        System.out.println("\n*******************************************************************\n");


    }

    static void displayMenu(){
        System.out.println("""
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
}
