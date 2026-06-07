public class Animal {
    String colour;
    int age;
    boolean isAlive;
    public static int numberOfAnimals;

    Animal(String colour, int age){
        this.colour = colour;
        this.age = age;
        isAlive = true;
        numberOfAnimals++;
    }

    void move(){
        System .out.println("This animal is running");
    }

    void sound(){
        System.out.println("This animal crys");
    }

    public String toString(){
        return this.getClass().getSimpleName()+ "=>"+ this.getClass().getName() + 
               " Colour=>" + this.colour + 
               " age=>" + this.age;
    }
}
