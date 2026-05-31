
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();

        System.out.print("Enter number of elements you want to enter: ");
        int num = scanner.nextInt();
        int i = 1;
        while(num > 0){
            System.out.print("Enter element " + i + ": ");
            myList.add(scanner.nextInt());
            i++;
            num--;
        }
        
        System.out.println("My original List => " + myList);
        
        uniqueListElements(myList);

        System.out.println("My sorted unique List => " + myList);

        scanner.close();

    }

    public static List<Integer> uniqueListElements(List<Integer> numbersList){
        for (int i = 0; i < numbersList.size(); i++){
            for (int j = numbersList.size() - 1;  j > i; j--){
                if (numbersList.get(i) == numbersList.get(j)){
                    numbersList.remove(j);
                }
            }
        }
        Collections.sort(numbersList);
        return numbersList;
        
    }
}
