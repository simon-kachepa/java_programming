package file_handling_07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Program to read file contents using FleInputStream
 */

public class Main {
    
    public static void main(String[] args){

        String filePath = "/Users/rutendogono/Desktop/test.txt";
        try(FileInputStream inputStream = new FileInputStream(filePath)){
            
            int i;
            while ((i = inputStream.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Error: File not found");
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong!");
        }
        System.out.println();
        System.out.println();
    }
}
