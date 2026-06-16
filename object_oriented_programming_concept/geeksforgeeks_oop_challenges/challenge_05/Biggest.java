package challenge_05;

public class Biggest {
    private int[] numbers;

    public Biggest(int[] numbers){
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }
    public int[] getNumbers(){
        return this.numbers;
    }
    public void display(){

        if (numbers == null || numbers.length == 0){
            System.out.println("The array is empty");
            return;
        }
       
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            max = (numbers[i] > max)? numbers[i] : max;
        }

        System.out.println("The max is: " + max);
    
    }
}
