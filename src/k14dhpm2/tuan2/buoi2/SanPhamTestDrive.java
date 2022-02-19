package k14dhpm2.tuan2.buoi2;

import java.util.ArrayList;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        //bai 1
        /*SanPham sp1 = new SanPham("dien thoai", 7000000.0, 150000.0);
        sp1.xuat();*/

        //bai 2
        /*SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();

        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();*/
        
        //bai 3
        /*SanPham sp1 = new SanPham("xe may", 10000000.0, 300000.0);
        sp1.xuat();

        SanPham sp2 = new SanPham("xe dap", 800000.0, 0);
        sp2.xuat();*/

        //bai 4
        /*SanPham sp1 = new SanPham();
        sp1.setTenSp("may giat");
        sp1.setDonGia(10000000.0);
        sp1.setGiamGia(500000.0);
        sp1.xuat();*/

        //bai 5
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        SanPham sp1 = new SanPham("tu lanh", 1000000.0, 200000.0);
        dsSanPham.add(sp1);
        SanPham sp2 = new SanPham("may giat", 4000000.0, 0);
        dsSanPham.add(sp2);
        for (SanPham sanPham : dsSanPham){
            sanPham.xuat();
        }
    }
    
}
