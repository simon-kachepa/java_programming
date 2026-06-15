package challenge_03;

public class Employee {

    private String name;
    private String department;
    private String email;
    private int employeeID;
    private String position;
    
    public Employee(){
        this.name = "Unknown";
        this.department = "Default";
        this.email = "new_employee@company.com";
        this.employeeID = 2026;
        this.position = "Unknown";
    }

    public Employee(String name){
        this.name = name;
        this.department = "Default";
        this.email = "new_employee@company.com";
        this.employeeID = 2026;
        this.position = "Unknown";
    }

    public Employee(String name, int employeeID){
        this.name = name;
        this.department = "Default";
        this.email = "new_employee@company.com";
        this.employeeID = employeeID;
        this.position = "Unknown";
    }

    public Employee(String name, String email, int employeeID){
        this.name = name;
        this.department = "Default";
        this.email = email;
        this.employeeID = employeeID;
        this.position = "Unknown";
    }
    public Employee(String name, String email, String department, int employeeID){
        this.name = name;
        this.department = department;
        this.email = email;
        this.employeeID = employeeID;
        this.position = "Unknown";
    }

    public Employee(String name, String email, String department, int employeeID, String position){
        this.name = name;
        this.department = department;
        this.email = email;
        this.employeeID = employeeID;
        this.position = position;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public int getStudentID(){
        return this.employeeID;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getPosition(){
        return this.position;
    }
}
