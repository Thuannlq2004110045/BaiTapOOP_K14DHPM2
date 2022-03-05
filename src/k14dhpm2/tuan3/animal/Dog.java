package k14dhpm2.tuan3.animal;

public class Dog extends Canine{
    //dac thu cua rieng no
    @Override //ghi de
    protected void eat(){
        System.out.println("Dog Eating ... dog food ..");
    }

    @Override //ghi de
    protected void makeNoise(){
        System.out.println("gau gau ... ");
    }

    //bo sung  them
    public void chaseCat(){
        System.out.println("Chasing ...");
    }
}
