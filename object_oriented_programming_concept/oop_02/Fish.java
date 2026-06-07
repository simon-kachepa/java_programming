public class Fish extends Animal{
    String species;
    public static int numOfFish;

    Fish(String species, String colour, int age){
        super(colour, age);
        this.species = species;
        numOfFish++;
    }

    @Override
    void move(){
        System.out.println("This Fish swimms");
    }

    @Override
    void sound(){
        System.out.println("This fish drums/grunts");
    }

    @Override
    public String toString(){
        return this.getClass().getSuperclass().getSimpleName()+ "=>"+ this.getClass().getName() + 
               " Colour=>" + this.colour + 
               " age=>" + this.age;
    }
    
}
