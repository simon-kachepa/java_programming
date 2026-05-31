import java.util.Scanner;

// Program that perfoms simple mathematical calculations (+, -, *, /, ^)
public class SimpleCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean isOperatorValid = true;

        System.out.println("*******************************************************************\n");
        System.out.println("WELCOME TO A SIMPLE CALCULATOR!\n");
        System.out.println("*******************************************************************\n");
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = addition(num1, num2);
            case '-' -> result = subtraction(num1, num2);
            case '*' -> result = multiplication(num1, num2);
            case '/' -> {
                    if (num2 == 0){
                        System.out.println("\n***********************************\n");
                        System.out.println("Cannot divide by 0");
                        isOperatorValid = false;
                        
                    }
                    else
                        result = division(num1, num2);
            }
            case '^' -> result = power(num1, num2);
            default -> {
                System.out.println("\n***********************************\n");
                System.out.println("Invalid operator");
                isOperatorValid = false;
            }
        }
        if (isOperatorValid){
            System.out.println("\n***********************************\n");
            System.out.println(num1 + " " + operator + " "+ num2 + " = "+ result);
        }

        System.out.println("\n*******************************************************************\n");

        scanner.close();
    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static double power(double num1, double num2){
        return Math.pow(num1, num2);
    }
}
