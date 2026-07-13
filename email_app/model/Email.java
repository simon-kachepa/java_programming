package model;

import java.util.Scanner;

public class Email {

    Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private Department department;
    private int departmentCode;
    private int mailboxCapacity;
    private String email;
    private String password;
    private String companyDomain = "company.com";

    public Email(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeDepartment();
        this.department = Department.getDepartmentFromInt(this.departmentCode);

        System.out.println(this.firstName + " " + this.lastName);
        System.out.println(this.department);
    }

    private void setFirstName(String firstName){
        if(firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("ERROR: Name can not be empty");
        }
        this.firstName = firstName;
    }

    private void setLastName(String lastName){
        if(lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("ERROR: Name can not be empty");
        }
        this.lastName = lastName;
    }

    //Get Employee department
    public void setEmployeeDepartment(){
        System.out.println("SELECT DEPARTMENT CODE: ");
        for(Department department : Department.values()){
            System.out.println(department.getDepartmentCode() + ". " + department);
        }
        System.out.print("Enter your department choice (1 - " + Department.values().length + "): ");
        if(scanner.hasNextInt()){
            if(scanner.nextInt() < 1 && scanner.nextInt() > Department.values().length){
                scanner.nextLine();
                throw new IllegalArgumentException("ERROR: Invalid Department Code");
            }
            this.departmentCode = scanner.nextInt();
            scanner.nextLine();
        }
        else{
            scanner.nextLine();
            throw new IllegalArgumentException("ERROR: Department code must be a number");
        }   
    }
    
}
