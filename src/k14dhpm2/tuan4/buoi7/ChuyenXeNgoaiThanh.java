package k14dhpm2.tuan4.buoi7;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDi;

    public ChuyenXeNgoaiThanh(){
        super();
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi){
        super();
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public void setNoiDen(String noiDen){
        this.noiDen = noiDen;
    }

    public String getNoiDen(){
        return this.noiDen;
    }

    public void setSoNgayDi(int soNgayDi){
        this.soNgayDi = soNgayDi;
    }

    public int getSoNgayDi(){
        return this.soNgayDi;
    }

    @Override
    public void nhapChuyenXe() {
        // TODO Auto-generated method stub
        super.nhapChuyenXe();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap noi den: ");
        this.noiDen = scanner.nextLine();
        System.out.println("Nhap so ngay di: ");
        this.soNgayDi = scanner.nextInt();
        scanner.nextLine();
    }

    public String toString(){
        return super.toString() + "     Noi den: " + this.noiDen + "     So ngay di duoc: " + this.soNgayDi;
    }
}
