package challenge_09;

public class LargestNumber {
    
    public static int findLargest(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num1 && num2 > num3){
            return num2;
        }
        else{
            return num3;
        }
    }
    public static double findLargest(double num1, double num2, double num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num1 && num2 > num3){
            return num2;
        }
        else{
            return num3;
        }
    }
}
