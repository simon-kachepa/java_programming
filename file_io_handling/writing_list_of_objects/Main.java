package writing_list_of_objects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import object_to_file.Employee;

public class Main {
    
    public static void main(String[] args){
        ArrayList<Employee> empList = new ArrayList<>();
        String filePath = "/Users/rutendogono/Desktop/employees.txt";
        int numOfEmployees = 0;
        String empFirstName;
        String empLastName;
        int age;
        double salary;


        try(Scanner scanner = new Scanner(System.in); 
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream)){
            System.out.print("Enter number of Employees to enter: ");
            numOfEmployees = scanner.nextInt();
            scanner.nextLine();

            while(numOfEmployees > 0){
                System.out.print("Enter employee First name: ");
                empFirstName = scanner.nextLine();
                System.out.print("Enter employee Last name: ");
                empLastName = scanner.nextLine();
                System.out.print("Enter employee's age: ");
                age = scanner.nextInt();
                System.out.print("Enter employee's Salary': ");
                salary = scanner.nextDouble();
                scanner.nextLine();

                empList.add(new Employee(empFirstName, empLastName, age, salary));
                numOfEmployees--;
            }
            if (!empList.isEmpty()){
                objOutputStream.writeObject(empList);
                System.out.println("Employee list successfully saved to file");
            }
            else {
                System.out.println("Employee list is empty. File not saved");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Error: Number of employees must be an integer");
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Could not locate file");
        }
        catch(IOException e){
            System.out.println("Error: Could not write to file");
        }
    }
}
