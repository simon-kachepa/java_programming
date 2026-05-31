// Program that counts the number of occurance of an element in an array.
import java.util.Scanner;

public class ElementOccurance {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {1, 4, 2, 6, 3, 2, 1, 2};
        int count = 0;

        System.out.print("Enter your number: ");
        int element = scanner.nextInt();

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] == element)
                count++;
        }

        System.out.println(element + " occurs " + count + " times");

        scanner.close();

    }
    
}
