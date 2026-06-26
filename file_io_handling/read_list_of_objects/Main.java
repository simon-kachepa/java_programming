package read_list_of_objects;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import object_to_file.Employee;

/*
 * Program to read list of objects from file
 */
public class Main {
    
    public static void main(String[] args){
        ArrayList<Employee> empList = new ArrayList<>();
        String filePath = "/Users/rutendogono/Desktop/employees.txt";

        try(FileInputStream fInputStream = new FileInputStream(filePath);
            ObjectInputStream oInputStream = new ObjectInputStream(fInputStream)){

                empList = (ArrayList<Employee>)oInputStream.readObject();
                
                for(Employee employee : empList){
                    System.out.println(employee.getFullName());
                }
            }
            catch(FileNotFoundException e){
                System.out.println("Error: Could not locate file");
            }
            catch(EOFException e){
                System.out.println("Error: File is empty or corrupted");
            }
            catch(ClassNotFoundException e){
                System.out.println("Error: Could not locate Class.");
            }
            catch(IOException e){
                System.out.println("Error: Could not read from file");
            }
        
    }
}
