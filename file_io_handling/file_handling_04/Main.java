package file_handling_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Program to read data from a file
 */

public class Main {

    public static void main(String[] args){
        String filePath = "/Users/rutendogono/Desktop/test.txt";
        File file = new File(filePath);
        System.out.println("\n****************************************************\n");
        try(Scanner scanner = new Scanner(file)){

            while(scanner.hasNextLine()){
                String fileData = scanner.nextLine();
                System.out.println(fileData);
            }
            
        }
        catch (FileNotFoundException e){
            System.out.println("Error: File does not exist");
        }

        System.out.println("\n****************************************************\n");

    }
    
}
