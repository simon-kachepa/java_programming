import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "fruits.txt";
        List<String> words = new ArrayList<>();
        String word;
        int wrongGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        List<Character> wordState = new ArrayList<>();
        Random random = new Random();

        try(FileReader freader = new FileReader(filePath);
            BufferedReader breader = new BufferedReader(freader)){
                String line;
                while((line = breader.readLine()) != null){
                    words.add(line);
                }
            }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file: " + filePath);
        }
        catch(IOException e){
            System.out.println("OOPS: Something Went wrong");
        }

        word = words.get(random.nextInt(words.size()));

        // To initialise the wordState to underscores since we haven't found any matching character.
        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }
        
        System.out.println("\n************************************************************************************\n");
        System.out.println("\tWELCOME TO JAVA HANGMAN GAME\n");
        System.out.println("\n************************************************************************************\n");

        while(wrongGuesses < 6){

            System.out.print(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for(char character: wordState){
                System.out.print(character+ " ");
            }
            System.out.println();

            System.out.print("Enter your guess letter: ");
            char guessLetter = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guessLetter) >= 0){
                System.out.println("Correct guess\n");
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guessLetter){
                        wordState.set(i, guessLetter);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else {
                System.out.println("Wrong guess!\n");
                wrongGuesses++;
            }
        }
        if(wrongGuesses >= 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

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


