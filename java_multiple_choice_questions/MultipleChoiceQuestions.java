import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class MultipleChoiceQuestions {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] randomNumbers = new int[10];
        char[] answers = {'a', 'b', 'b', 'c', 'c', 'c', 'b', 'c', 'c', 'b', 'c', 'b', 'c', 'c', 'd', 'b', 'c', 'd', 'a', 'c',
                          'c', 'b', 'b', 'c', 'b', 'b', 'b', 'c', 'c', 'b'};
        char choice;
        int randomNumber;
        int index = 0;
        int score = 0;
        String doAgain = "yes";

        System.out.println("********************************************************************************\n");
        System.out.println("   JAVA MULTIPLE CHOICE QUESTIONS\n");
        System.out.println("********************************************************************************\n");
       
        while (doAgain.equals("yes")){

            while(index < 10){
                randomNumber = random.nextInt(30);
                boolean isUniqueNumber = true;
                for (int i = 0; i < randomNumbers.length; i++){
                    if (randomNumber == randomNumbers[i]){
                        isUniqueNumber = false;
                        break;
                    }
                }
                if (isUniqueNumber){
                    randomNumbers[index] = randomNumber;
                }
                else {
                    continue;
                }
                index++;
            }

            for (int i = 0; i < randomNumbers.length; i++){
                System.out.println((i + 1) + ". " + displayQuestions(randomNumbers[i]));
                displayAnswers(randomNumbers[i]);
                System.out.print(" Enter your choice: ");
                choice = scanner.nextLine().toLowerCase().charAt(0);
                if (choice == answers[randomNumbers[i]]){
                    System.out.println(" ✅ Correct!\n");
                    score++;
                }
                else {
                    System.out.println(" ❌ Incorrect!");
                    System.out.println(" Correct answer: "+ answers[randomNumbers[i]] + "\n");
                }
            }
            System.out.println("**********************************\n");
            System.out.println("You scored "+ score + " out of 10\n");
            System.out.println("**********************************\n");
            System.out.print("Do you want to do again(yes/no)?: ");
            doAgain = scanner.nextLine().toLowerCase();
            
        }
        //printing question
        
        System.out.println("\n********************************************************************************\n");
        scanner.close();
    }

    public static String displayQuestions(int questionNumber){
        String[] questions = {"Which keyword is used to create a subclass?",
                              "What is the default value of a boolean variable?",
                              "Which data type is used to create a single character?",
                              "Which operator is used to compare two values for equality?",
                              "Which method is the starting point for any Java program?",
                              "How do you find the length of a string str?",
                              "Which memory area stores local variables in Java?",
                              "Which keyword makes a variable's value unchangeable?",
                              "What is the index of the first element in a Java array?",
                              "Which exception is thrown when dividing an integer by zero?",
                              "Which keyword belongs to a class rather than an instance?",
                              "Which collection allows duplicate elements?",
                              "Which package is imported by default in every Java program?",
                              "What is the size of an int variable in Java?",
                              "Which keyword is used to handle exceptions?",
                              "What is the direct superclass of all classes in Java?",
                              "Which access modifier offers the least visibility?",
                              "Which of these is NOT a valid access modifier?",
                              "How do you instantiate an object in Java?",
                              "Which loop is guaranteed to execute at least once?",
                              "What is the return type of a constructor?",
                              "Which keyword stops the execution of a loop?",
                              "Which data structure uses LIFO (Last In First Out)?",
                              "Which of these is a reference type?",
                              "What does OOP stand for?",
                              "Which mechanism achieves runtime polymorphism?",
                              "Which file extension contains compiled Java bytecode?",
                              "Which operator is used for logical AND?",
                              "Which feature hides internal implementation details?",
                              "Can you change the size of a standard array after creation?"
                            };

        return questions[questionNumber];
    }
    public static void displayAnswers(int questionNumber){

        String[][] options = {{"a. extends", "b. implements", "c. inherits", "d. super"},
                              {"a. true", "b. false", "c. null", "d. 0"},
                              {"a. String", "b. char", "c. chr", "d. Character"},
                              {"a. =", "b. equals", "c. ==", "d. ==="},
                              {"a. start()", "b. init()", "c. main()", "d. run()"},
                              {"a. str.length", "b. str.size()", "c. str.length()", "d. str.len()"},
                              {"a. Heap", "b. Stack", "c. Method Area", "d. Register"},
                              {"a. static", "b. const", "c. final", "d. private"},
                              {"a. 1", "b. -1", "c.0 ", "d. any"},
                              {"a. NullPointerException", "b. ArithmeticException", "c. IOException", "d. NumberFormatException"},
                              {"a. this", "b. super", "c. static", "d. final"},
                              {"a. Set", "b. List", "c. Map", "d. HashSet"},
                              {"a. java.util", "b. java.io", "c. java.lang", "d. java.net"},
                              {"a. 8 bits", "b. 16 bits", "c. 32 bits", "d. 64 bits"},
                              {"a. try", "b. throw", "c. catch", "d. All of the above"},
                              {"a. Class", "b. Object", "c. Main", "d. Root"},
                              {"a. public", "b. protected", "c. private", "d. default"},
                              {"a. public", "b. private", "c. protected", "d. internal"},
                              {"a. new", "b. create", "c. make", "d. alloc"},
                              {"a. for", "b. while", "c. do-while", "d. foreach"},
                              {"a. void", "b. int", "c. No return type", "d. Object"},
                              {"a. continue", "b. break", "c. return", "d. exit"},
                              {"a. Queue", "b. Stack", "c. ArrayList", "d. LinkedList"},
                              {"a. int", "b. boolean", "c. String", "d. char"},
                              {"a. Online Object Program", "b. Object Oriented Programming", "c. Operational Object Process", "d. Office Object Protocol"},
                              {"a. Overloading", "b. Overriding", "c. Encapsulation", "d. Abstraction"},
                              {"a. .java", "b. .class", "c. .exe", "d. .jar"},
                              {"a. &", "b. |", "c. &&", "d. ||"},
                              {"a. Inheritance", "b. Polymorphism", "c. Encapsulation", "d. Compilation"},
                              {"a. Yes", "b. No", "c. Only if empty", "d. Only if static"}   
                              };

        for (int i = 0; i < options[0].length; i++){
            System.out.println("   "+ options[questionNumber][i]);
        }
            
    }
}