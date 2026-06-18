package challenge_08;

public class Student {
    
    private String name;
    private int rollNo;
    private double marks;

    public Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // getters fo accessing the data filelds
    public String getName(){
        return this.name;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public double getMarks(){
        return this.marks;
    }

    public char calculateGrade(){
        if (this.marks >= 75){
            return 'A';
        }
        else if (this.marks >= 60){
            return 'B';
        }
        else if (this.marks >= 50){
            return 'C';
        }
        else if (this.marks >= 40){
            return 'D';
        }
        else if (this.marks >= 35){
            return 'E';
        }
        else {
            return 'U';
        }
        
    }

    public void displayGrade(){
        System.out.println(this.rollNo + "\t" + this.name + "\t" + calculateGrade());
    }
}
