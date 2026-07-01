public class Main{

    public static void main(String[] args){
        
        TraficLight traficLight = TraficLight.GREEN;

        System.out.println("Trafic Light condition: " + traficLight);

        for (TraficLight condition : TraficLight.values()){
            System.out.println(condition);
        }
    }
}