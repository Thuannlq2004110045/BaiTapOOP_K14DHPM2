package k14dhpm2.tuan1;

public class CircleTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.name = "Hinh tron";
        circle.bankinh = 20.0;
        circle.thetich = 200.0;
        circle.weight = 300.0;

        circle.show();
        circle.xoay();
        circle.playMusic();
    }

}
