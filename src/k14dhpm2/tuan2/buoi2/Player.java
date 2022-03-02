package k14dhpm2.tuan2.buoi2;

public class Player {
    private int number = 0;

    public int getNumber(){
        return number;
    }
    
    public void guess()
    {
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing " + number);
    }
}
