import java.util.Arrays;

//Program that places the odd elements of an array before the even elements
public class OddElementsFirst {
    public static void main(String[] args){
        int[] myArray = {1, 2, 7, 5, 0, 3, 6, 8, 4, 3};
        int[] newArray = new int[myArray.length];
        int j = 0;
        int k = myArray.length - 1;

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 != 0){
                newArray[j] = myArray[i];
                j++;
            }
            else{
                newArray[k] = myArray[i];
                k--;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
