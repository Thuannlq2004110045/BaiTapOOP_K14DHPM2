package k14dhpm2.tuan4.buoi7;

import java.util.Scanner;

public class ChuyenXe {
    private int maSoChuyen;
    private String hoTentaiXe;
    private int soXe;
    private double doanhThu;


    public ChuyenXe(){}

    public ChuyenXe(int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTentaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu; 
    }

    public void setMaSoChuyen(int maSoChuyen){
        this.maSoChuyen = maSoChuyen;
    }

    public int getMaSoChuyen(){
        return this.maSoChuyen;
    }

    public void setHoTenTaiXe(String hoTenTaiXe){
        this.hoTentaiXe = hoTenTaiXe;
    }

    public String getHoTenTaiXe(){
        return this.hoTentaiXe;
    }

    public void setSoXe(int soXe){
        this.soXe = soXe;
    }

    public int getSoXe(){
        return this.soXe;
    }

    public void setDoanhThu(double doanhThu){
        this.doanhThu = doanhThu;
    }

    public double getDoanhthu(){
        return this.doanhThu;
    }

    public void nhapChuyenXe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so chuyen: ");
        this.maSoChuyen = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho ten tai xe: ");
        this.hoTentaiXe = scanner.nextLine();
        System.out.println("Nhap so xe: ");
        this.soXe = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap doanh thu: ");
        this.doanhThu = scanner.nextDouble();
        scanner.nextLine();
    }

    public void xuatChuyenXe(){

    }

    public void tongDoanhThu(double doanhThu){
        
    }

    public String toString(){
        String str = "Ma so chuyen: " + this.maSoChuyen + "      Ho ten tai xe: " + this.hoTentaiXe + "       So xe: " + this.soXe + "        Doanh thu: " +  this.doanhThu;
        return str;
    }
}
