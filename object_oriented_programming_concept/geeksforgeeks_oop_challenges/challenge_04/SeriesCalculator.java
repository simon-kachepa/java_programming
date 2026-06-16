public class SeriesCalculator {
    

    /* defining the method that calculates the sum of the first n elements of a series
        Sum = (n/2) * [2*a + (n-1)*d], where "a" is the first term and "d" is the common difference.
    */ 

    public int calculateSum(int n){
        int a = 1;
        int d = 2;

        int sum = (n * (2 * a + (n - 1)* d)) / 2;

        return sum;
    }
}
