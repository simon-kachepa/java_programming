package model;

import java.util.Random;
import java.util.Scanner;

import view.ConsoleInputHandler;

public class Email {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private Department department;
    private ConsoleInputHandler ui = new ConsoleInputHandler();

    private String firstName;
    private String lastName;
    private int departmentCode;
    private int mailboxCapacity;
    private String email;
    private String altenateEmail;
    private String password;
    private int passwordLength = 10;
    private String companyDomain = "company.com";

    public Email(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeDepartment();
        this.department = Department.getDepartmentFromInt(this.departmentCode);
        setEmail();
        this.password = generatePassword(passwordLength);
        this.mailboxCapacity = 500;


        System.out.println(this.firstName + " " + this.lastName);
        System.out.println(this.department);
        System.out.println(email);
        System.out.println(password);
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
        ui.displayDepartments();
        int choice = ui.readDepartmentCode();
        if(choice < 1 || choice > Department.values().length){
            throw new IllegalArgumentException("ERROR: Department Code must be between 1 and " + Department.values().length);
        }
        this.departmentCode = choice;   
    }

    public void setEmail(){
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + 
        "@" + this.department + "." + companyDomain;
    }

    public String getEmail(){
        return this.email;
    }

    private String generatePassword(int length){
        String passwordPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$&*;,.";
        char[] password = new char[10];

        for (int i = 0; i < length; i++){
            password[i] = passwordPool.charAt(random.nextInt(passwordPool.length()));
        }
        return new String(password);
    }

    public void setAltenateEmail(String altenateEmail){
        this.altenateEmail = altenateEmail;
    }

    public void setMailboxCapacity(int newMailboxCapacity){
        this.mailboxCapacity = newMailboxCapacity;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }

    public String getAltenateEmail(){
        return this.altenateEmail;
    }

    public String getPassword(){
        return this.password;
    }
    
    public void getInfo(){
        System.out.println("First name: " + firstName + " " +
        "\nLast name: "+ lastName + " " +
        "\nDepartment: " + this.department + " " + 
        "\nEmail: " + this.email);
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString(){
        return this.email;
    }

    public int getDepartmentCode(){
        return this.departmentCode;
    }
}
