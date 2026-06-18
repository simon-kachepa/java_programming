package challenge_12;

public class StudentMark {
    
    private String name;
    private int[] marks = new int[3];

    public StudentMark(String name, int mark1, int mark2, int mark3){
        this.name = name;
        this.marks[0] = mark1;
        this.marks[1] = mark2;
        this.marks[2] = mark3;
    }

    public int calculateSum(){
        int sum = 0;
        for (int mark : marks){
            sum += mark;
        }
        return sum;
    }

    public double calculateAverage(){
        return (calculateSum() / this.marks.length);
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Sum of marks: " + calculateSum());
        System.out.println("Average of marks: " + calculateAverage());
    }
}
