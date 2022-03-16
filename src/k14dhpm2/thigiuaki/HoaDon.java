package k14dhpm2.thigiuaki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    protected String maHD, tenKH, maPhong;
    protected Date ngayHD;
    protected double donGia;
    protected double ThanhTien;

    Scanner scanner = new Scanner(System.in);

    protected String getMaHD() {
        return maHD;
    }
    protected void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    protected String getTenKH() {
        return tenKH;
    }
    protected void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    protected String getMaPhong() {
        return maPhong;
    }
    protected void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    protected Date getNgayHD() {
        return ngayHD;
    }
    protected void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    protected double getDonGia() {
        return donGia;
    }
    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    protected HoaDon(String maHD, String tenKH, String maPhong, Date ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }

    protected HoaDon(){

    }

    /**đổi chuỗi (theo chuẩn ngày Việt Nam) sang ngày java */
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        //ngày việt nam
        Date date;
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }

    protected void nhapHoaDon() throws ParseException{
        System.out.println("Nhap ma hoa don: ");
        this.maHD = scanner.nextLine();
        System.out.println("Nhap ngay hoa don: ");
        this.ngayHD = chuyenChuoiSangNgay(scanner.nextLine());
        System.out.println("Nhap ten khach hang: ");
        this.tenKH = scanner.nextLine();
        System.out.println("Nhap ma phong: ");
        this.maPhong = scanner.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return " [donGia=" + donGia + ", maHD=" + maHD + ", maPhong=" + maPhong + ", ngayHD=" + ngayVietNam.format(ngayHD)
                + ", tenKH=" + tenKH + "]";
    }

    

}
