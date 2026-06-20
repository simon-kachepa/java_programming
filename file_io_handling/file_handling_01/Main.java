package file_handling_01;

import java.io.File;
import java.io.IOException;

/*
 * First program to create files
 */
public class Main {
    public static void main(String[] args){
        
        String path = "/Users/rutendogono/Desktop";
        String fileName = "text.txt";
        String filePath = path + "/" + fileName;
    
        try {
            File file = new File(filePath);
            if (file.createNewFile()){
                System.out.println("File successfully created: " + fileName);
            }
            else {
                System.out.println("File already exist: " + fileName);
            }
        }
        catch (IOException e){
            System.out.println("Error: Something went wrong");
        }
       
    }
    
}
