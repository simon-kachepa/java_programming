public class Main{
    public static void main(String[] args){
        
        Car mycar = new Car("Corvette", "black", 50_000, "V8");

        mycar.displayInfo();

        System.out.println(mycar.getEngineType());
    }
}