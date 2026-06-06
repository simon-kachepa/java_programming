import java.util.Scanner;

public class TenOOPMultipleQuestions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] answers = {'B', 'B', 'D', 'C', 'C', 'B', 'D', 'C', 'B', 'B'};
        char choice;
        int score = 0;

        System.out.println("*************************************************************************************************\n");
        System.out.println("   OOP IN JAVA MULTIPLE CHOICE QUESTIONS 💠  \n");
        System.out.println("*************************************************************************************************\n");

        for(int question = 0; question < answers.length; question++){
            displayQuestion(question);
            displayChoices(question);
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().toUpperCase().charAt(0);

            // Checking user choice and comparing it with the correct answer from the pool of correct answers
            if (choice == answers[question]){
                System.out.println("✅ CORRECT!\n");
                score++;
            }
            else {
                System.out.println("❌ WRONG!\n");
            }
            

        }
        System.out.println("***************************\n");
        System.out.println("You scored " + score + " out of " + answers.length + "\n");
        System.out.println("*************************************************************************************************\n");
        scanner.close();
    }

    public static void displayQuestion(int questionNumber){
        String[] questions = {"1. Which keyword is used in Java to inherit a class?",
                              "2. What is it called when two or more methods in the same class have the same name but different parameters?",
                              "3. Which access modifier provides the highest level of data hiding and is typically used for class variables to enforce encapsulation?",
                              "4. Which of the following statements is true about an abstract class in Java?",
                              "5. Which keyword prevents a class from being subclassed (inherited)?",
                              "6. If a subclass provides a specific implementation for a method that is already defined in its superclass, this is known as:",
                              "7. Which of the following is true about interfaces in Java (Java 8 and later)?",
                              "8. What is the primary purpose of the this keyword in Java?",
                              "9. Which statement is true regarding constructors in Java?",
                              "10. How can a subclass invoke a overridden method named display() from its parent class?"};
        
                              System.out.println(questions[questionNumber]+"\n");
    }

    public static void displayChoices(int question){
        String choices[][] = {{"A. implements", "B. extends", "C. inherits", "D. using"},
                              {"A. Method Overriding", "B. Method Overloading", "C. Encapsulation", "D. Dynamic Binding"},
                              {"A. public", "B. protected", "C. default", "D. private"},
                              {"A. It can be instantiated directly using the new keyword.", "B. It must contain only abstract methods.", "C. It can contain both abstract methods (without a body) and concrete methods (with a body).", "D. It cannot have constructors."},
                              {"A. static", "B. abstract", "C. final", "D. volatile"},
                              {"A. Method Overloading", "B. Method Overriding", "C. Method Duplication", "D. Compile-time Polymorphism"},
                              {"A. A class can extend multiple interfaces.", "B. Interfaces cannot have any method implementations at all.", "C. An interface can declare instance variables.", "D. Interfaces can contain default and static methods with bodies."},
                              {"A. To refer to the parent class object.", "B. To invoke a static method of the class.", "C. To refer to the current class instance.", "D. To create a new instance of a class."},
                              {"A. A constructor must have a return type like void.", "B. If you don't write a constructor, Java provides a default no-argument constructor automatically.", "C. Constructors can be declared as abstract.", "D. A subclass automatically inherits the constructors of its superclass."},
                              {"A. this.display()", "B. super.display()", "C. parent.display()", "D. display()"}};

        for (int answers = 0; answers < choices[0].length; answers++){
            System.out.println(choices[question][answers]);
        }

        System.out.println();
        
    }
}