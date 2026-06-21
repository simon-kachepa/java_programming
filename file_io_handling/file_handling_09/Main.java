package file_handling_09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Program to copy file contents to another file
 */

public class Main {
    
    public static void main(String[] args){
        String oldFilePath = "/Users/rutendogono/Desktop/photo.png";
        String newFilePath = "/Users/rutendogono/Desktop/copy.png";

        try(FileInputStream inputStream = new FileInputStream(oldFilePath);
            FileOutputStream outputStream = new FileOutputStream(newFilePath)){
                
                int i;
                while((i = inputStream.read()) != -1){
                    outputStream.write(i);
                }
                System.out.println("Successfully copied the file");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: File was not found");
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }
}
