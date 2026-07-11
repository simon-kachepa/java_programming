import java.util.Scanner;

import model.Email;
import view.ConsoleInputHandler;

public class EmailApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ConsoleInputHandler ui = new ConsoleInputHandler();

        ui.displayWelcomeMessage();
        int choice = 0;
        boolean running = true;
        
        while(running){
            ui.displayMenu();
            choice = ui.readUserChoice();
            switch(choice){
                case 1 -> System.out.println("Create new email");
                case 2 -> System.out.println("Change Passwort");
                case 3 -> System.out.println("Set Mailbox Capacity");
                case 4 -> System.out.println("Set altinate Email");
                case 5 -> System.out.println("Display Email");
                case 6 -> System.out.println("Display Name");
                case 7 -> System.out.println("Display Mailbox Capacity");
                case 8 -> System.out.println("Display All Emails");
                case 9 -> running = false;
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
}
