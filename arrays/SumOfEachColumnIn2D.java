public class SumOfEachColumnIn2D {
    public static void main(String[] args){
        int[][] myArray = {{2, 3, 4},
                           {1, 4, 6},
                           {5, 3, 1},
                           {3, 2, 1}
                          };

        int sum = 0;
        int row = 0;;

        for (int column = 0; column < myArray[row].length; column++){
            for (row = 0; row < myArray.length; row++){
                System.out.println(myArray[row][column]);
            }
        }
    }
}
