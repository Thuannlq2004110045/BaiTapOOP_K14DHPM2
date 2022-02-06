package k14dhpm2.tuan1;

public class TriangleTestDrive {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area = 16;
        triangle.color = "xanh";
        triangle.fileSound = "HinhTamGiac.AIF";

        triangle.show();
        triangle.rotate();
        triangle.play();
    }
}
