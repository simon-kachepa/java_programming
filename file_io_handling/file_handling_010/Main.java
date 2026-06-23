package file_handling_010;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    /*
     * Simple program to write array contents to a file
     */
    
    public static void main(String[] args){
        String[] friends = {"Tino", "Taku", "Tracy", "Tonde", "Thamary"};

        try(FileOutputStream outputStream = new FileOutputStream("/Users/rutendogono/Desktop/friends.txt")){
            for(String friend : friends){
                String line = friend + System.lineSeparator();
                outputStream.write(line.getBytes());
            }
            System.out.println("Successfully wrote to a file");
        }
        catch(IOException e){
            System.out.println("Error: something went wrong");
        }
    }
}
