public class Bird extends Animal{
    String species;
    public static int numOfBirds;

    Bird(String species, String colour, int age){
        super(colour, age);
        this.species = species;
        numOfBirds++;
    }

    @Override
    void move(){
        System.out.println("This bird flies");
    }

    @Override
    void sound(){
        System.out.println("This bird sings");
    }

    @Override
    public String toString(){
        return this.getClass().getSuperclass().getSimpleName()+ "=>"+ this.getClass().getName() + 
               " Colour=>" + this.colour + 
               " age=>" + this.age;
    }
    
}
