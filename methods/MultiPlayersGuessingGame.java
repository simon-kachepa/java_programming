import java.util.Random;
import java.util.Scanner;

public class MultiPlayersGuessingGame {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayers;
        boolean isGameOver = false;

        System.out.println("************************************************************************************************\n");
        System.out.println("WELCOME TO MULTI PLAYERS GUESSING GAME🔥🔥💥\n");
        System.out.println("************************************************************************************************\n");

        System.out.print("How many players would like to play: ");
        numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n********************************************************\n");

        String[] name = new String[numberOfPlayers];
        int[] randomNumber = new int[numberOfPlayers];
        int [] guess = new int[numberOfPlayers];

        //Collecting players usernames and generating random number for each player
        for(int i = 0; i < numberOfPlayers; i++){
            System.out.print("Enter username for player number " + (i + 1) + ": ");
            name[i] = scanner.nextLine();
            randomNumber[i] = generateRandomNumber();
        }
        System.out.println("\n********************************************************\n");

        //Keep guesssing until someone win
        while(!isGameOver){
            for(int i = 0; i < numberOfPlayers; i++){
                System.out.print(name[i] + " enter your guess number (between 1 and 100): ");
                guess[i] = scanner.nextInt();
                if(guess[i] == randomNumber[i]){
                    System.out.println("\n" + name[i] + " won! Congratulation 🎊🎉🔥\n");
                    System.out.println("GAME OVER!!!\n");
                    isGameOver = true;
                    break;
                }
                else if (guess[i] < randomNumber[i]){
                    System.out.println("Too low 😔😔😔. Try again on your next turn.\n");
                    System.out.println("********************************************************\n");
                }
                else{
                    System.out.println("Too high 😔😔😔. Try again on your next turn\n");
                    System.out.println("********************************************************\n");
                }

            }
        }
        System.out.println("************************************************************************************************\n");

        scanner.close();
    }

    public static int generateRandomNumber(){
        Random random = new Random();

        return random.nextInt(1, 11);
    }
    
}
