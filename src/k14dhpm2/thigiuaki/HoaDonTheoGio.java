package k14dhpm2.thigiuaki;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoGio extends HoaDon{

    protected int soGioThue;

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio() {
        super();
        this.soGioThue = 0;
    }

    public HoaDonTheoGio(String maHD, String tenKH, String maPhong, Date ngayHD, double donGia, int soGioThue) {
        super(maHD, tenKH, maPhong, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }

    @Override
    protected void nhapHoaDon() throws ParseException {
        super.nhapHoaDon();
        System.out.println("nhap so gio thue: " );
        this.soGioThue = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "HoaDonTheoGio" + super.toString() + "[soGioThue=" + soGioThue + ", Thanh tien: " + this.ThanhTien + "]";
    }

    public double tinhThanhTien(){
        double soNgayThue;
        if(this.soGioThue<=24){
            this.ThanhTien = this.soGioThue * this.donGia;
        }
        if(this.soGioThue>24 & this.soGioThue<30){
            this.ThanhTien = this.soGioThue * this.donGia;
        }
        if(this.soGioThue>30){
            soNgayThue = this.soGioThue/24;
            if(soNgayThue<=7){
                this.ThanhTien = soNgayThue * this.donGia;
            }
            if(soNgayThue>7){
                this.ThanhTien = soNgayThue * this.donGia;
            }
        }
        return this.ThanhTien;
    }
}
