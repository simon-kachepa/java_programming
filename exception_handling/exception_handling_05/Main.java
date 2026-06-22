package exception_handling_05;

/*
 * Program to show throws, that should be handled by the calling method. 
 */

public class Main {

    public static void main(String[] args){

        try {
            divide(10, 0);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide any number by zero");
        }
        
    }

    public static void divide(int num1, int num2)throws ArithmeticException{
        System.out.println(num1/num2);
    }
    
}
