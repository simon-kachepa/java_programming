package buffered_writer_02;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Program to use BufferedWriter to append text to an existing file
 */

public class Main {
    
    public static void main(String[] args){
        String filePath = "/Users/rutendogono/Desktop/myTest.txt";
        String myText = """
                        **this is to append**
                        Keep going
                        Keep trusting
                        Have hope and
                        Work hard
                    """;

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            writer.write(myText);
            System.out.println("Successfully wrote to file");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Could not locate file");
        }
        catch(IOException e){
            System.out.println("Error: Could not write to file");
        }
    }
}
