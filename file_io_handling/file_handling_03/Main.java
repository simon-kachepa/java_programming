package file_handling_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args){
        
        String file = "/Users/rutendogono/Desktop/test.txt";
        String myText = """
                        I am appending the English version of my text!
                        Learning java is really fun.
                        I am really motivated.
                        I will not give up.
                        """;

        try(FileWriter filewriter = new FileWriter(file, true)){
            filewriter.write(myText);
            System.out.println("Successfully appended text to the file");
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }
}
