package k14dhpm2.tuan1;

public class SquareTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        square.area = 16;
        square.color = "vang";
        square.fileSound = "HinhVuong.AIF";

        square.show();
        square.rotate();
        square.play();
    }
}
