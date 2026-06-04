public class MaxInEachRow {
    public static void main(String[] args){
        int[][] myArray = {{10, 48, 27, 4},
                           {43, 78, 45, 81},
                           {74, 35, 58, 24,}
                        };

        for (int row = 0; row < myArray.length; row++){
            int max = myArray[row][0];
            for (int column = 0; column < myArray[row].length; column++){
                if (myArray[row][column] > max){
                    max = myArray[row][column];
                }
            }
            System.out.println("Max in row " + (row + 1)+ ": " + max);
        }
    }
}
