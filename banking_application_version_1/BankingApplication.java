import java.util.Scanner;

public class BankingApplication {
    public static Scanner scanner = new Scanner(System.in);
    public static double recentTransaction;
    public static void main(String[] args){
        double balance = 0;
        int choice;

        System.out.println("****************************************************************************\n");
        System.out.println("BANKING APPLICATION\n");
        System.out.println("****************************************************************************\n");

        do{
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch(choice){
                case 1 -> {
                            showBalance(balance);
                            System.out.println("\n*****************************************\n");
                            }

                case 2 -> {
                            balance += deposit();
                            System.out.println("\n*****************************************\n");
                        }
                case 3 -> {
                            balance -= withdraw(balance);
                            System.out.println("\n*****************************************\n");
                        }
                case 4 -> {
                            showRecentTransaction();
                            System.out.println("\n*****************************************\n");
                        }
                case 5 -> System.out.println("Thank you. Have a nice day!\n");

                default -> {
                            System.out.println("Invalid choice");
                            System.out.println("\n*****************************************\n");
                        }
            }

        }while(choice != 5);

        System.out.println("****************************************************************************\n");
        
    }

    public static void displayMenu(){
        System.out.println("1. View Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Recent Transaction");
        System.out.println("5. Exit()");
        System.out.println();
    }

    public static void showBalance(double balance){
        System.out.printf("BALANCE: $%.2f\n", balance);
    }

    public static double deposit(){
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();
        System.out.println();

        if (amount < 0){
            System.out.println("Failed. Cannot deposit negative amount\n");
            return 0;
        }
        else {
            System.out.printf("Successfully deposited $%.2f\n", amount);
            recentTransaction = amount;
            return amount;
        }
    }

    public static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        System.out.println();

        if(amount > balance){
            System.out.println("Failed. Insufficient funds\n");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Failed. Cannot withdraw negative amount\n");
            return 0;
        }
        else{
            System.out.printf("Successfully withdrawn $%.2f\n", amount);
            recentTransaction = -amount;
            return (amount);
        }
    }

    public static void showRecentTransaction(){
        if (recentTransaction > 0){
            System.out.printf("Deposited $%.2f\n", recentTransaction);
        }
        else if (recentTransaction < 0){
            System.out.printf("Withdrawn $%.2f\n", Math.abs(recentTransaction));
        }
        else{
            System.out.println("No recent activity");
        }
    }
}