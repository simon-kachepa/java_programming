public class SumOfEachColumnIn2D {
    public static void main(String[] args){
        int[][] myArray = {{2, 3, 4, 6},
                           {1, 4, 6},
                           {5, 3, 1, 9, 0, 1},
                           {3, 2, 1}
                          };
        int maxLength = myArray[0].length;

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i].length > maxLength){
                maxLength = myArray[i].length;
            }
        }

        for (int column = 0; column < maxLength; column++){
            int sum = 0;
            for(int row = 0; row < myArray.length; row++){
                if (column < myArray[row].length){
                    sum += myArray[row][column];
                }
                else {
                    continue;
                }
            }

            System.out.println("Sum at column " + (column + 1) + ": "+ sum);
        }
    }
}
