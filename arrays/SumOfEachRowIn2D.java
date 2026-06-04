//  Program that prints the sum of each row in a 2D array.

public class SumOfEachRowIn2D {
    public static void main(String[] args){
        int[][] my2DArray = {{3, 4, 2, 8},
                            {4, 5, 1, 3}, 
                            {2, 5, 8, 4}, 
                            {9, 7, 3, 8}
                            };

        for (int row = 0; row < my2DArray.length; row++){
            int sum = 0;
            for (int column = 0; column < my2DArray[row].length; column++){
                sum += my2DArray[row][column];
            }
            System.out.println("Sum of row " + row + "is: "+ sum);
        }
    }
}