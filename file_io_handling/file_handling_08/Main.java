package file_handling_08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Program to write content to afile using FileOutputStream
 */

public class Main {
    
    public static void main(String[] args){

        String myText = """
                        I am enjoying Java programming.
                        It is really fun.
                        I will keep going
                        """;

        String filePath = "/Users/rutendogono/Desktop/doc.txt";

        try(FileOutputStream outputStream = new FileOutputStream(filePath)){
            
            outputStream.write(myText.getBytes());
            System.out.println("Successully wrote to a file");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: File was not found");
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }
}
