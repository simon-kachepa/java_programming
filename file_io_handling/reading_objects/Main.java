package reading_objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import object_to_file.Employee;

/*
 * Program to read object from a file
 */

public class Main {
    
    public static void main(String[] args){
        
        Employee emp = null;

        String filePath = "/Users/rutendogono/Desktop/employees.bin";

        try(FileInputStream savedFile = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(savedFile)){
                emp = (Employee)inputStream.readObject();
                if(!emp.equals(null)){
                    System.out.println(emp.getFullName());
                    System.out.println(emp.getSalary());
                }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(ClassNotFoundException e){
            System.out.println("Could not locate class.");
        }
        catch(IOException e){
            System.out.println("Could not read from file");
        }
    }
}
