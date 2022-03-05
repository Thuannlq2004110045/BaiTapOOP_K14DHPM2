package k14dhpm2.tuan3.animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeNoise();//overide
        cat.sleep();
        cat.chaseButterfly();//them

        Dog dog = new Dog();
        dog.eat();
        dog.makeNoise();
        dog.sleep();
        dog.chaseCat();

        Hippo hippo = new Hippo();
        hippo.eat();
        hippo.makeNoise();
        hippo.sleep();
        hippo.swim();

        Lion lion = new Lion();
        lion.eat();
        lion.makeNoise();
        lion.sleep();
        lion.roam();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.makeNoise();
        tiger.sleep();
        tiger.roam();
        tiger.Hunt();

        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.makeNoise();
        wolf.sleep();
        wolf.roam();
        wolf.Hunt();
    }
}
