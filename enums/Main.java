public class Main{

    public static void main(String[] args){
        
        TraficLight traficLight = TraficLight.AMBER;

        // Printing the enum value
        System.out.println("Trafic Light condition: " + traficLight);

        // Printing the enum value's number, ie RED = 1;
        System.out.println(traficLight.getLightValue());

        /* 
        // Looping through the enum values...
        for (TraficLight condition : TraficLight.values()){
            System.out.println(condition);
        }
        */

        //Using enum to great switch statements

        switch(traficLight){
            case RED -> System.out.println("STOP!");
            case AMBER -> System.out.println("GET READY!");
            case GREEN -> System.out.println("GO");

        }

    }
}