package object_to_file;

/*
 * Program to write object to a file
 */

import java.io.Serializable;

public class Employee implements Serializable {

    private int employeeID = 0;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary){
        this.employeeID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("%03d %s %s %d $%.2f", employeeID, firstName, lastName, age, salary); 
    }
    
}
