import java.util.Scanner;

public class Methodds01 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        String name = getName();
        int age = getAge();

        System.out.println("Hello "+ name + ". You are "+ age + " years old.");
    }

    public static String getName(){
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static int getAge(){
        System.out.print("Enter your age: ");
        return scanner.nextInt();
    }
}
