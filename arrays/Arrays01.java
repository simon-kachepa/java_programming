import java.util.Arrays;
import java.util.Scanner;
public class Arrays01 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] myArray = createArray(size);
        printArray(myArray);

    }

    public static int[] createArray(int size){
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }

    public static void printArray(int[] myarray){
        System.out.println(Arrays.toString(myarray));
        for (int i = 0; i < myarray.length; i++){
            System.out.print(myarray[i] + " ");
        }
        System.out.println();
    }

}