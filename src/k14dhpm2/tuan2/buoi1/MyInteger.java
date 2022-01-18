package k14dhpm2.tuan2.buoi1;

public class MyInteger {
    private int value;

    public MyInteger(int initialValue){
        value = initialValue;
    }

    public MyInteger(){
        this(0);
    }

    public MyInteger(MyInteger other){
        this(other.value);
    }

    public boolean greaterThan (MyInteger other){
        return (this.value > other.value);
    }

    public boolean lessThan (MyInteger other){
        return (other.greaterThan(this));
    }

    public MyInteger increment(){
        value++;
        return this;
    }
}
