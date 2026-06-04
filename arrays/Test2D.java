public class Test2D {
    public static void main(String[] args){
        int[][] array = {{1, 2}, 
                         {2, 3, 4, 1},
                         {3, 4, 8}
                        };

        for (int row = 0; row < array.length; row++){
            int sum = 0;
            for (int column = 0; column < array[row].length; column++){
                sum += array[row][column];
            }
            System.out.println("Sum of row " + row +": "+ sum);
        }
    }
}
