package file_handling_05;

import java.io.File;

/*
 * Program to get file information
 */

public class Main {

    public static void main(String[] args){
        
        String filePath = "/Users/rutendogono/Desktop/test.txt";
        File file = new File(filePath);

        if(file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Is file writable: " + file.canWrite());
            System.out.println("Is file readable: " + file.canRead());
            System.out.println("File size: " + file.length());
        }
        else {
            System.out.println("File does not exist");
        }
    }
}
