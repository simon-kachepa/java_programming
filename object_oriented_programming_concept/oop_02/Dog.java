public class Dog extends Animal{
    String breed;
    public static int numOfDogs;

    Dog(String breed, String colour, int age){
        super(colour, age);
        this.breed = breed;
        numOfDogs++;
    }

    @Override
    void move(){
        System.out.println("This Dog runs");
    }

    @Override
    void sound(){
        System.out.println("This Dog barks");
    }

    @Override
    public String toString(){
        return this.getClass().getSuperclass().getSimpleName()+ "=>"+ this.getClass().getName() + 
               " Colour=>" + this.colour + 
               " age=>" + this.age;
    }
    
}
