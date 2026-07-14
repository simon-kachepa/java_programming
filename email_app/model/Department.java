package model;

public enum Department {
    SALES(1), DEVELOPMENT(2), ACCOUNTING(3);

    private final int departmentCode;

    Department(int departmentCode){
        this.departmentCode = departmentCode;
    }

    public static Department getDepartmentFromInt(int departmentCode){
        for(Department department: values()){
            if(department.departmentCode == departmentCode){
                return department;
            }
        }
        throw new IllegalArgumentException("ERROR: Invalid department code");
    }

    public int getDepartmentCode(){
        return this.departmentCode;
    }
}
