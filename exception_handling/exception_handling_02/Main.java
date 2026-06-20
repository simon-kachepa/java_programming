package exception_handling_02;

/*
 * Program to show finally in a try and catch code
 */
public class Main {
    public static void main(String[] args){
        
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1/num2;
            System.out.println("Result => " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Dividing by 0!");
        }
        finally{
            System.out.println("This always executes ");
        }
        System.out.println("Program continues normal way ...");
    }
}
