package exception_handling_04;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * Program that shows try with resouces, new java feature to automatically close resources
 */

public class Main {
    public static void main(String[] args){
        
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        int guess;
        try(Scanner scanner = new Scanner(System.in)){
            do {
                System.out.print("Enter a random number between 1 and 10: ");
                guess = scanner.nextInt();
                if (guess < 0 || guess > 10){
                    System.out.println("Number out of range!");
                }
                else if (guess > randomNumber){
                    System.out.println("Too high, Try again!");
                }
                else if (guess < randomNumber){
                    System.out.println("Too low, Try again!");
                }
                else {
                    System.out.println("Correct!");
                }
            }while(guess != randomNumber);
        }
        catch (InputMismatchException e){
            System.out.println("Error: That was not a number!");
        }
        catch (Exception e){
            System.out.println("Error: Something went wrong!");
        }

        System.out.println("GAME OVER!");
    } 
}
