public class Car {
    private String model;
    private String colour;
    private int price;
    private Engine engineType;

    // Constructor to initialise the data fields
    public Car(String model, String colour, int price, String engineType){
        this. model = model;
        this.colour = colour;
        this.price = price;
        this.engineType = new Engine(engineType);
    }

    // Getters methods to access the data fields
    public String getModel(){
        return this.model;
    }
    public String getColour(){
        return this.colour;
    }
    public String getPrice(){
        return "$" + this.price;
    }

    public String getEngineType(){
        return this.engineType.getType();
    }

    public void displayInfo(){
        System.out.println(this.getPrice() + " " + this.getColour() + " " + this.getModel() + " of engine type " + this.getEngineType());
    }

}
