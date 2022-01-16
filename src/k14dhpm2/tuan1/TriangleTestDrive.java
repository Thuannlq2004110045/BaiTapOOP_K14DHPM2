package k14dhpm2.tuan1;

public class TriangleTestDrive {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.name = "Hinh tam giac";
        triangle.canh = 10.0;
        triangle.thetich = 100.0;
        triangle.weight = 200.0;

        triangle.show();
        triangle.xoay();
        triangle.playMusic();
    }
}
