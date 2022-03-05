package k14dhpm2.tuan3.animal;

public class Tiger extends Feline{
    //dac thu cua rieng no
    @Override //ghi de
    protected void eat(){
        System.out.println("Tiger Eating ... meat ..");
    }

    @Override //ghi de
    protected void makeNoise(){
        System.out.println("Tiger sound ... ");
    }

    //bo sung  them
    public void Hunt(){
        System.out.println("Hunting alone...");
    }
}
