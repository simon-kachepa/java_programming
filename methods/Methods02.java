import java.util.Scanner;

public class Methods02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        System.out.print("Prime numbers between "+ num1 + " and " + num2 + ": ");
        checkPrimeNumber(num1, num2);

    }

    public static void checkPrimeNumber(int num1, int num2){
        for (int i = num1; i <= num2; i++){
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();

    }

    public static boolean isPrime(int num){
        boolean isPrimeNumber = true;
        for (int i = 2; i < num / 2; i++){
            if (num % i == 0){
                return isPrimeNumber = false;
            }
        }
        return isPrimeNumber;
    }
}
