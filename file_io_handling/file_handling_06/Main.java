package file_handling_06;

import java.io.File;

/*
 * Program to delete a file on a given path
 */

public class Main {
    
    public static void main(String[] args){

        String filePath = "/Users/rutendogono/Desktop/test.txt";
        File file = new File(filePath);

        if (file.exists()){
            if (file.delete()){
                System.out.println("File deleted successfully.");
            }
            else {
                System.out.println("Error: Failed to delete the file");
            }
        }
        else {
            System.out.println("File does not exist");
        }
    }
}
