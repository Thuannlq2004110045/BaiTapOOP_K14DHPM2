package k14dhpm2.tuan1;

public class CircleTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area = 16;
        circle.color = "do";
        circle.fileSound = "HinhTron.AIF";

        circle.show();
        circle.rotate();
        circle.play();
    }

}
