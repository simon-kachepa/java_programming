public class Car {
    String make;
    String colour;
    int year;
    double price;
    boolean isNew;
    public static int numberOfCars;

    //creating constructors
    Car(){
        make = "Volkswagen";
        colour = "black";
        year = 2025;
        price = 30_000.00;
        isNew = true;
        numberOfCars++;
    }
    Car(String make){
        this.make = make;
        colour = "black";
        year = 2025;
        price = 30_000.00;
        isNew = true;
        numberOfCars++;
    }
    Car(String make, String colour){
        this.make = make;
        this.colour = colour;
        year = 2025;
        price = 30_000.00;
        isNew = true;
        numberOfCars++;
    }
    Car(String make, String colour, int year){
        this.make = make;
        this.colour = colour;
        this.year = year;
        price = 30_000.00;
        isNew = true;
        numberOfCars++;
    }
    Car(String make, String colour, int year, double price){
        this.make = make;
        this.colour = colour;
        this.year = year;
        this.price = price;
        isNew = true;
        numberOfCars++;
    }

    public void drive(){
        System.out.printf("You drive a %s %d %s that costs $%.2f \n", colour, year, make, price);
    }
    public void park(){
        System.out.printf("You parked a %s %d %s that costs $%.2f\n", colour, year, make, price);
    }
}
