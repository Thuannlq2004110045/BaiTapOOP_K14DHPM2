package k14dhpm2.tuan1;

public class SquareTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        square.name = "Hinh vuong";
        square.canh = 10.0;
        square.thetich = 100.0;
        square.weight = 200.0;

        square.show();
        square.xoay();
        square.playMusic();
    }
}
