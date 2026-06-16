package challenge_06;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length){
        if (length <= 0){
            System.out.println("Length must be greater than 0");
            return;
        }
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    
    public void setWidth(double width){
        if (width <= 0){
            System.out.println("Width must be greater than 0");
            return;
        }
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }

    public double calculateArea(){
        return getLength() * getWidth();
    }
}
