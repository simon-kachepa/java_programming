// Program that finds min and max elements of an array.

public class MinAndMax {

    public static void main(String[] args){

        int[] myArray = {1, 7, 4, 2, 9, -3, 4, 5};

        System.out.println("Max = "+ getMaxElement(myArray) + ", Min = "+ getMinElement(myArray));

    }

    public static int getMaxElement(int[] numArray){
        int maxElement = numArray[0];

        for (int i = 1; i < numArray.length; i++){
            if (numArray[i] > maxElement)
                maxElement = numArray[i];
        }

        return maxElement;
    }

    public static int getMinElement(int[] numArray){
        int minElement = numArray[0];

        for (int i = 1; i < numArray.length; i++){
            if (numArray[i] < minElement)
                minElement = numArray[i];
        }
        return minElement;
    }
    
}
