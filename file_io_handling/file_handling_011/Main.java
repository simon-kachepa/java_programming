package file_handling_011;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args){

        String[] friends = new String[5];
        try(FileInputStream inputStream = new FileInputStream("/Users/rutendogono/Desktop/friends.txt")){
            int line;
            int index;
            while((line = inputStream.read()) != -1){
                friends[index] = String.parseInt(line);
            }
        }
        catch(IOException e){
            System.out.println("Error: Something went wrong");
        }
    }
}
