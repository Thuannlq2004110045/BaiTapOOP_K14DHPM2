package k14dhpm2.tuan2.buoi1;

public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        if(size>14){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Wroff! Wroff!");
        }
    }

    void setBigger(){
        size +=5;
    }

    void run(){
        System.out.println("Running...");
        this.bark();
    }
}
