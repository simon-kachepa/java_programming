package challenge_06;

public class Main {
    
    public static void main(String[] args){
        
        Rectangle rectangle = new Rectangle();
        double area = rectangle.calculateArea();
        System.out.println("The area is: " + area);

        Rectangle anotherRectangle = new Rectangle(20, 10);
        double anotherArea = anotherRectangle.calculateArea();
        System.out.println("Another area is: " + anotherArea);

       rectangle.setLength(10);
       rectangle.setWidth(5);
       double newArea = rectangle.calculateArea();
       System.out.println("The new area is: " + newArea);
       
    }
}
