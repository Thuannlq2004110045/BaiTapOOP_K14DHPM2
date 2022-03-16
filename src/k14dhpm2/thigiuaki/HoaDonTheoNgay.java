package k14dhpm2.thigiuaki;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    
    private int soNgayThue;

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay() {
        super();
        this.soNgayThue = 0;
    }

    public HoaDonTheoNgay(String maHD, String tenKH, String maPhong, Date ngayHD, double donGia, int soNgayThue) {
        super(maHD, tenKH, maPhong, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    @Override
    protected void nhapHoaDon() throws ParseException {
        super.nhapHoaDon();
        System.out.println("nhap so ngay thue: " );
        this.soNgayThue = scanner.nextInt();
        scanner.nextLine();
    }

    public double tinhThanhTien(){
        if(this.soNgayThue<=7){
            this.ThanhTien = this.soNgayThue * this.donGia;
        }
        if(this.soNgayThue>7){
            int soNgayConLai = this.soNgayThue -7;
            this.ThanhTien = this.donGia * 7 + (this.donGia-this.donGia*0.2)*soNgayConLai;
        }
        return this.ThanhTien;
    }

    @Override
    public String toString() {
        return "HoaDonTheoNgay" + super.toString() + "[soNgayThue=" + soNgayThue + ", Thanh tien: " + this.ThanhTien + "]";
    }

    
}
