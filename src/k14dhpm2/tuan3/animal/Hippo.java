package k14dhpm2.tuan3.animal;

public class Hippo extends Animal{
    //dac thu cua rieng no
    @Override //ghi de
    protected void eat(){
        System.out.println("Hippo Eating ... Hippo food ..");
    }

    @Override //ghi de
    protected void makeNoise(){
        System.out.println("Hippo sound ... ");
    }

    //bo sung  them
    public void swim(){
        System.out.println("Swimming ...");
    }
}
