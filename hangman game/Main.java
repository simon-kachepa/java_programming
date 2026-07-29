import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String word = "mangoe";
        Scanner scanner = new Scanner(System.in);
        List<Character> wordState = new ArrayList<>();
        
        System.out.println("\n************************************************************************************\n");
        System.out.println("\tWELCOME TO JAVA HANGMAN GAME\n");
        System.out.println("\n************************************************************************************\n");

        // To initialise the wordState to underscores since we haven't found any matching character.
        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.print("Word: ");
        for(char character: wordState){
            System.out.print(character);
        }
        System.out.println();

        System.out.println(getHangmanArt(6));


        scanner.close();
        System.out.println("\n************************************************************************************\n");

    }

    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){

            case 0 -> """
                    


                      """;

            case 1 -> """
                     o


                      """;
            case 2 -> """
                     o
                     |
   
                      """;
            case 3 -> """
                     o
                    /|
      
                     """;
            case 4 -> """
                     o
                    /|\\
         
                    """;

            case 5 -> """
                     o
                    /|\\
                    /
                       """;

            case 6 -> """
                     o
                    /|\\
                    / \\
                          """;

            default -> "";

        };
    }
}


