package k14dhpm2.tuan3.animal;

public class Wolf extends Canine{
    //dac thu cua rieng no
    @Override //ghi de
    protected void eat(){
        System.out.println("Wolf Eating ... meat ..");
    }

    @Override //ghi de
    protected void makeNoise(){
        System.out.println("Wolf sound ... ");
    }

    //bo sung  them
    public void Hunt(){
        System.out.println("Hunting together...");
    }
}
