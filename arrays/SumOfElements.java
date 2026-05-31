// Program that prints the sum, product and average of the elements of an array.

public class SumOfElements {
    
    public static void main(String[] args){
        int[] myArray = {10, -2, 8, 3, 6, 5};
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
