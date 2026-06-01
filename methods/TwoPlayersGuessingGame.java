import java.util.Random;
import java.util.Scanner;

public class TwoPlayersGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userName1;
        String userName2;
        int guess1 = 0;;
        int guess2 = 0;;
        int randomNumber1;
        int randomNumber2;

        System.out.println("********************************************************************************\n");
        System.out.println("WELCOME TO TWO PLAYERS GUESSING GAME\n");
        System.out.println("********************************************************************************\n");

        // Getting players usernames
        System.out.print("Enter first player's username: ");
        userName1 = scanner.nextLine();
        System.out.print("Enter second player's username: ");
        userName2 = scanner.nextLine();

        randomNumber1 = generateRandomNumber();
        randomNumber2 = generateRandomNumber();

        do{
            //First player's turn
            System.out.println("\n*****************************************\n");
            System.out.print(userName1 + " enter your guess number(between 1 and 100): ");
            guess1 = scanner.nextInt();
            if (guess1 == randomNumber1){
                System.out.println("\n*****************************************\n");
                System.out.println(userName1 + " won. Game over!n");
                break;
            }
            else if (guess2 < randomNumber2){
                System.out.println("Too low. Try again on your next turn");
            }
            else {
                System.out.println("Too high. Try again on your next turn");

            }
            System.out.println("\n******************************************\n");
            // Second player's turn
            System.out.print(userName2 + " enter your guess number(between 1 and 100): ");
            guess2 = scanner.nextInt();

            if(guess2 == randomNumber2){
                System.out.println("\n******************************************\n");
                System.out.println(userName2 + " won. Game over!\n");
                break;
            }
            else if (guess2 < randomNumber2){
                System.out.println("Too low. Try again on your next turn");
            }
            else {
                System.out.println("Too high. Try again on your next turn");

            }


        } while(guess1 != randomNumber1 && guess2 != randomNumber2);

        System.out.println("********************************************************************************\n");


        scanner.close();
    }

    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(1, 11);
    }
}
