package k14dhpm2.tuan3.animal;

public class Cat extends Feline{
    //dac thu cua rieng no
    @Override //ghi de
    protected void eat(){
        System.out.println("Cat Eating ... fish, ..");
    }

    @Override //ghi de
    protected void makeNoise(){
        System.out.println("Meo meo ... ");
    }

    //bo sung  them
    public void chaseButterfly(){
        System.out.println("Chasing ...");
    }
}
