package k14dhpm2.tuan2.buoi1;

public class DogTestDrive {
    public static void main(String[] args) {
        
        Dog one = new Dog();
        one.size =7;
        Dog two = new Dog();
        two.size = 13;

        two.bark();
        two.setBigger();
        two.bark();

        one.bark();
    }
}
