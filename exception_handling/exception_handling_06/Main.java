package exception_handling_06;

/*
 * Program to throw a new exception from a method to the calling metho
 */
public class Main {

    public static void main(String[] args){

        try{
            divide(10, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Error caught in main()");
        }

    }

    public static void divide(int num1, int num2){
        try{
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("Error caught in divide()");
            throw new ArithmeticException();
        }
    }
    
}
