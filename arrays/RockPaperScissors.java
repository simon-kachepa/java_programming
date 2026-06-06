import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("*****************************************************\n");
        System.out.println("  ROCK PAPER SCISSORS GAME \n");
        System.out.println("*****************************************************\n");

        do {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
                System.out.println("🚫INVALID CHOICE\n");
            }
            else{
                computerChoice = choices[random.nextInt(3)];
                System.out.println(":-: " + computerChoice);

                // determining winning conditions
                if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("paper") && computerChoice.equals("rock") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper")){
                        System.out.println("YOU WIN! 🎊\n");
                    }

                else if (userChoice.equals("rock") && computerChoice.equals("paper") ||
                        userChoice.equals("paper") && computerChoice.equals("scissors") ||
                        userChoice.equals("scissors") && computerChoice.equals("rock")){
                            System.out.println("YOU LOSE! 😔\n");
                        }
                else {
                    System.out.println("It's a tie 🤝\n");
                }
            }

            System.out.println("-----------------------------------------");
            System.out.print("Do you want to play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
            System.out.println("-----------------------------------------\n");

        } while (playAgain.equals("yes"));

        System.out.println("   GOOD BYEEE! 💥\n");
        System.out.println("******************************************************\n");

        scanner.close();
    }
}
