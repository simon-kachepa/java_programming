//Program that fills an array with n points entered by the user.

import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;
public class ArrayOfPoints {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter the number of points you want to enter: ");
        int numOfPoints = scanner.nextInt();

        while(numOfPoints < 1 || numOfPoints > 20){
            System.out.print("Invalid number of points. Enter valid number: ");
            numOfPoints = scanner.nextInt();
        }

        Point[] myPoint = new Point[numOfPoints];
        createArrayOfPoints(myPoint);
        printArrayOfPoints(myPoint);
        System.out.println(Arrays.toString(myPoint));
        

    }
   private static void printArrayOfPoints(Point[] points) {
    System.out.print("The Points are: ");
        for (int i = 0; i < points.length; i++){
            System.out.print("(" + points[i].x + ", "+ points[i].y + ")");
        }
        System.out.println("");
    }
public static void createArrayOfPoints(Point[] points) {

    for (int i = 0; i < points.length; i++){
        System.out.print("Enter x,y of Point " + (i + 1)+ ": ");
        points[i] = new Point(scanner.nextInt(), scanner.nextInt());
    }
    }
   

    
}
