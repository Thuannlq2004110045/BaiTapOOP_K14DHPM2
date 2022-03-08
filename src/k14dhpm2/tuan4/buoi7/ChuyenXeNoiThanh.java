package k14dhpm2.tuan4.buoi7;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private int soKm;

    public ChuyenXeNoiThanh(){
        super();
    }

    public ChuyenXeNoiThanh(int soTuyen, int soKm){
        super();
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public void setSoTuyen(int soTuyen){
        this.soTuyen = soTuyen;
    }

    public int getSoTuyen(){
        return this.soTuyen;
    }

    public void setSoKm(int soKm){
        this.soKm = soKm;
    }

    public int getSoKm(){
        return this.soTuyen;
    }

    @Override
    public void nhapChuyenXe() {
        // TODO Auto-generated method stub
        super.nhapChuyenXe();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tuyen: ");
        this.soTuyen = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap so km di duoc: ");
        this.soKm = scanner.nextInt();
        scanner.nextLine();
    }

    public String toString() {
        return super.toString() + "      So tuyen: " + this.soTuyen + "      So Km: " + this.soKm;
    }
}
