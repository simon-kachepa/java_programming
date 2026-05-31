import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOptions {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        int choice;

        System.out.println("******************************************************************************************************************\n");
        System.out.println("Welcome to Main Menu\n");
        System.out.println("**************************************************************\n");

        do{
            System.out.println("1. Add Element \n2. Remove Element \n3. Display Elements \n4. Exit()");
            System.out.println("\n***********************************************\n");

            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    addElement(myList);
                    System.out.println("**************************************************************\n");
                    break;

                case 2:
                    removeElement(myList);
                    System.out.println("**************************************************************\n");
                    break;

                case 3:
                    displayElements(myList);
                    System.out.println("**************************************************************\n");
                    break;

                case 4:
                    System.out.println("Goodbyeee!");
                    System.out.println("******************************************************************************************************************\n");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println("**************************************************************\n");

            }

        }while(choice != 4);

        scanner.close();

    }

    public static void addElement(List<Integer> numsList){
        int value;
        System.out.print("Enter an element to add to the list: ");
        value = scanner.nextInt();
        numsList.add(value);
        System.out.println(value + " added to the list successfully");
    }

    public static void removeElement(List<Integer> numsList){
        int index;
        System.out.print("Enter index of an element to remove from the list: ");
        index = scanner.nextInt();
         if(index < 0 || index >= numsList.size()){
            System.out.println("Index out of range");
         }
         else {
            System.out.println(numsList.get(index) + " removed successfully");
            numsList.remove(index);
         }

    }

    public static void displayElements(List<Integer> numsList){
        System.out.println("Current List => "+ numsList);

    }

}
