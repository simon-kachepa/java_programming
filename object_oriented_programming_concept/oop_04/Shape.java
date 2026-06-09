import java.util.Scanner;

public abstract class Shape {
    Scanner scanner = new Scanner(System.in);
    String name;

    public Shape(){
        System.out.print("Enter name of the shame: ");
        this.name = scanner.nextLine();
    }

    abstract double area();

    String getName(){
        return this.name;
    }
    
}
