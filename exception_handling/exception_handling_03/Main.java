package exception_handling_03;

/*
 * Program to show thow to throw a new specific exception
 */
public class Main {
    
    public static void main(String[] args){

        System.out.println("Hello");
        ageCheck(20);
        ageCheck(16); // this will throw the IllegalArgumentException which will prevent the code execution to continue
        ageCheck(21); // this will not be executed

    }

    public static void ageCheck(int age){
        if (age < 18){
            throw new IllegalArgumentException("Age must be 18 and above");
        }
        else {
            System.out.println("Registration successfull");
        }
    }
}
