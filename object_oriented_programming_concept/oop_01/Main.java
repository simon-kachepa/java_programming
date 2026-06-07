public class Main {
    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car("Volvo", "blue");
        Car car4 = new Car("Toyota", "grey", 2026);
        Car car5 = new Car("Toyota", "grey", 2024, 50_000);


        System.out.println("********************************************************************\n");

        car1.drive();
        car2.drive();
        car3.drive();
        car4.drive();
        car5.drive();

        System.out.println("Total number of cars that you own: " + Car.numberOfCars);

        car1.park();
        car2.park();
        car3.park();
        car4.park();
        car5.park();

        System.out.println(car1.isNew);

        System.out.println("\n********************************************************************\n");
    }
}