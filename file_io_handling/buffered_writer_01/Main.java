package buffered_writer_01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Program to demonstrate simple use of the BufferedWrite to write to a file
 */
public class Main {
    
    public static void main(String[] args){
        
        String filePath = "/Users/rutendogono/Desktop/myTest.txt";
        String text = """
                        It pays to love what you do
                        Also, do what you love
                        Results are definitely on the way
                        Trust the process, it will definitely pays.
                    """;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write(text);
            System.out.println("Successfully wrote to a file");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Could not locate the file");
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }
}
