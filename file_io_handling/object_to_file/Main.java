package object_to_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    
    public static void main(String[] args){
        String filePath = "/Users/rutendogono/Desktop/employees.bin";

        Employee emp1 = new Employee("John", "Kachepa", 26, 80000);

        try(FileOutputStream outputStream= new FileOutputStream(filePath);
            ObjectOutputStream objOutputStream = new ObjectOutputStream(outputStream)){
                objOutputStream.writeObject(emp1);
                System.out.println("File written successfully!");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Could not locate file");
        }
        catch(IOException e){
            System.out.println("Error: Could not write to a file");
        }

    }
}
