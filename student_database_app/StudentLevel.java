public enum StudentLevel {
    FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);

    private int studentYear;

    // defining the enum constructor
    StudentLevel(int year){
        this.studentYear = year;
    }

    //getter method to get the studentYear
    public int getStudentYear(){
        return this.studentYear;
    }

    // display studentYear and its Level name
    public void displayLevels(){
        for (StudentLevel studentLevel : values()){
            System.out.println(studentLevel.studentYear + ". " +studentLevel);
        }
    }

    // getting student Level from its 
    public static StudentLevel fromStudentYear(int year){
        for (StudentLevel studentLevel: values()){
            if(studentLevel.studentYear == year){
                return studentLevel;
            }
        }
        throw new IllegalArgumentException("Invalid student year");
    } 
}