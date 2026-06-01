import java.util.Scanner;

public class TestMyMethod {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfNames;

        System.out.print("Enter number of names: ");
        numberOfNames = scanner.nextInt();
        scanner.nextLine();
        String[] name = new String[numberOfNames];

        for (int i = 0; i < numberOfNames; i++){
            System.out.print("Enter name " + (i + 1) + ": ");
            name[i] = scanner.nextLine();
        }

        System.out.println(name.toString());
        scanner.close();
    }
    
}
