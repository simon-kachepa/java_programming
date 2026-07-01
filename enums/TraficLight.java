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
    // static method to geth the value of the enum by its number
    public static TraficLight fromInt(int conditionNum){
        for (TraficLight condition: values()){
            if (condition.lightValue == conditionNum){
                return condition;
            }
            
        }
        throw new IllegalArgumentException("Invalid trafic condtion");
    }
}
