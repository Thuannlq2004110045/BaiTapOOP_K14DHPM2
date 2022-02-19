package k14dhpm2.tuan2.buoi2;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private Double donGia;
    private Double giamGia;

    public String getTenSp(){
        return this.tenSp;
    }

    public void setTenSp(String tenSp){
        this.tenSp = tenSp;
    }

    public Double getDonGia(){
        return this.donGia;
    }

    public void setDonGia(Double donGia){
        this.donGia = donGia;
    }

    public Double getGiamGia(){
        return this.giamGia;
    }

    public void setGiamGia(Double giamGia){
        this.giamGia = giamGia;
    }
    public SanPham(){};

    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
    }

    private Double getThueNhapKhau(){
        Double thueNhapKhau = donGia * 0.1;
        return thueNhapKhau;
    }

    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap gia giam: ");
        giamGia = scanner.nextDouble();
        scanner.nextLine();
    }

    public void xuat(){
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
