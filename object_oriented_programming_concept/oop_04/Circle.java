import java.util.Scanner;

public class Circle extends Shape{

    Scanner scanner = new Scanner(System.in);
    double radius;
    double circumference;

    public Circle(){
        System.out.print("Enter the radius: ");
        this.radius = scanner.nextDouble();
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
    
}
