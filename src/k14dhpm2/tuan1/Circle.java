package k14dhpm2.tuan1;

public class Circle {
    int area;
    String color;
    String fileSound;

    void rotate(){
        System.out.println("Dang xoay 360 do");
    }

    void play(){
        System.out.println("Dang phat nhac");
    }

    void show(){
        System.out.println("Area: " + area);
        System.out.println("Color: " + color);
        System.out.println("File Sound: " + fileSound );
    }
}
