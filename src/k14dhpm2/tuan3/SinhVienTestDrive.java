package k14dhpm2.tuan3;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(123, "Nguyen Van A", 6.5f, 8.4f);
        SinhVien sv2 = new SinhVien(124, "Nguyen Van B", 9.2f, 8.5f);
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap mssv: ");
        sv3.setMSSV(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap Ho ten: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.println("Nhap diem LT: ");
        sv3.setDiemLT(scanner.nextFloat());
        scanner.nextLine();
        System.out.println("Nhap diem Th: ");
        sv3.setDiemTH(scanner.nextFloat());
        scanner.nextLine();
        System.out.printf("%-30s %-30s%6s %6s %6s \n", "MSSV", "Hovaten", "ĐTH", "ĐLT", "ĐTB");
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv1.getMSSV(), sv1.getHoTen(), sv1.getDiemTH(), sv1.getDiemLT(), sv1.tinhTrungBinh());
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv2.getMSSV(), sv2.getHoTen(), sv2.getDiemTH(), sv2.getDiemLT(), sv2.tinhTrungBinh());
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv3.getMSSV(), sv3.getHoTen(), sv3.getDiemTH(), sv3.getDiemLT(), sv3.tinhTrungBinh());
    }
}
