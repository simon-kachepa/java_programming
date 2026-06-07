public class Main {
    public static void main(String[] args){

        Animal dog1 = new Dog("German Shepard", "brown", 3);
        Animal bird = new Bird("Parrot", "black", 2);
        Animal fish = new Fish("Gold", "white", 5);
        Dog dog2 = new Dog("Pitbull", "black", 4);

        Animal[] animals = {dog1, dog2, bird, fish};
        System.out.println("*********************************************************\n");

        for (Animal animal : animals){
            animal.move();
        }

        for (Animal animal : animals){
            System.out.println(animal);
        }

        System.out.println("Number of Animals: "+ Animal.numberOfAnimals);
        System.out.println("Number of Dogs: "+ Dog.numOfDogs);
        System.out.println("Number of Fish: "+ Fish.numOfFish);
        System.out.println("Number of Bird: "+ Bird.numOfBirds);

        
        System.out.println("\n*********************************************************");
    }
}