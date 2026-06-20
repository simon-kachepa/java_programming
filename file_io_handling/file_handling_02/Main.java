package file_handling_02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args){
        
        String path = "/Users/rutendogono/Desktop";
        String fileName = "test.txt";
        String filePath = path + "/" + fileName;
        String myText = """
                        Java Lernen macht wirklich Spaß.
                        Ich bin wirklich motiviert.
                        Ich gebe nicht auf.
                        """;

        try(FileWriter filewriter = new FileWriter(filePath)){
            filewriter.write(myText);
            System.out.println("Successfully writen to file: " + fileName);
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }
}
