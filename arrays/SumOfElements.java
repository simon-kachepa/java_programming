// Program that prints the sum, product and average of the elements of an array.

import java.util.Scanner;

public class SumOfElements {
    
    public static void main(String[] args){
        int[] myArray = new Array[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the array");
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Enter element " + i + ": ");
            myArray[i] = scanner.nextInt();
        }
        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            product *= myArray[i];
        }

        average = sum / myArray.length;

        System.out.println("Sum: "+ sum + "\nProduct: "+ product + "\nAverage: "+ average);

    }
}
