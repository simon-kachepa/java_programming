public enum TraficLight {
    RED(1), AMBER(2), GREEN(3);

    private final int lightValue;

    TraficLight(int lightValue){
        this.lightValue = lightValue;
    }

    public void displayConditions(){
        for (TraficLight condition: values()){
            System.out.println(condition);
        }
    }

    public int getLightValue(){
        return this.lightValue;
    }
}
