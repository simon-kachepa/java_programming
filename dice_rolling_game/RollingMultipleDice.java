import java.util.Random;
import java.util.Scanner;

public class RollingMultipleDice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice;
        int rollResult;
        int sum = 0;

        System.out.println("***********************************************************************************\n");
        System.out.println("WELCOME TO DICE ROLLING GAME!\n");
        System.out.println("***********************************************************************************\n");

        System.out.print("Enter number of dice you want to roll: ");
        numberOfDice = scanner.nextInt();
        System.out.println("\n*********************************************\n");
        if (numberOfDice > 0){

            for (int i = 0; i < numberOfDice; i++){
                rollResult = random.nextInt(1, 7);
                dice(rollResult);
                System.out.println("You rolled a " + rollResult + ".\n");
                sum += rollResult;
            }
            System.out.println("*********************************************\n");
            System.out.println("Your total roll: " + sum + "\n");
        }
        else{
            System.out.println("Number of dice must be more than 0.\n");
        }
        System.out.println("***********************************************************************************\n");


        scanner.close();
    }

    public static void dice(int rollResult){
        String dieSide1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dieSide2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dieSide3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dieSide4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dieSide5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dieSide6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (rollResult){
            case 1 -> System.out.println(dieSide1);
            case 2 -> System.out.println(dieSide2);
            case 3 -> System.out.println(dieSide3);
            case 4 -> System.out.println(dieSide4);
            case 5 -> System.out.println(dieSide5);
            case 6 -> System.out.println(dieSide6);
            default -> System.out.println("Invalid roll");
        }

    }
}