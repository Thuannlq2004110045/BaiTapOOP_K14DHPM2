package k14dhpm2.thigiuaki;

import java.text.ParseException;
import java.util.Scanner;

public class ListHoaDon {
    private HoaDon[] hoadon= new HoaDon[10000];
    private int countHoaDon;
    private int sumSoLuongThueTheoGio = 0, sumSoLuongThueTheoNgay = 0;
    private double sumthanhTienTheoGio=0 , sumthanhTienTheoNgay=0;
    Scanner scanner = new Scanner(System.in);

    public void ListHoaDon(){
        countHoaDon = 0;
        for(int i =0 ; i< 100; i++){
            hoadon[i] = new HoaDon();
        }
    }

    public void Listhoadon(int temp) throws ParseException{
        if(countHoaDon>10000)
            System.out.println("Khong the them du lieu");
            else{
                if(temp==1){
                    hoadon[countHoaDon] = new HoaDonTheoGio();
                    HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();
                    hoaDonTheoGio.nhapHoaDon();
                    hoadon[countHoaDon]=hoaDonTheoGio;
                    hoaDonTheoGio.tinhThanhTien();
                    sumSoLuongThueTheoGio+=1;
                    sumthanhTienTheoGio+=hoaDonTheoGio.tinhThanhTien();
                }
                else{
                    hoadon[countHoaDon] = new HoaDonTheoNgay();
                    HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();
                    hoaDonTheoNgay.nhapHoaDon();
                    hoadon[countHoaDon]= hoaDonTheoNgay;
                    hoaDonTheoNgay.tinhThanhTien();
                    sumSoLuongThueTheoNgay+=1;
                    sumthanhTienTheoNgay+=hoaDonTheoNgay.tinhThanhTien();
                }
                countHoaDon++;
            }
    }

    public void xuattt(){
        for(int i=0 ; i<countHoaDon; i++){
            System.out.println("-------------/--------------/-----------");
            System.out.println(hoadon[i].toString());
        }
    }
    

    public double tinhTBThanhTien(){
        double TBC = (sumthanhTienTheoGio+sumSoLuongThueTheoNgay)/(sumSoLuongThueTheoGio+sumSoLuongThueTheoNgay);
        System.out.println("Trung bình thanh tien: " + TBC);
        return TBC;
    }

    public void tinhTongSoLuongThuePhong(){
        System.out.println("--------------Doanh Thu--------------");
        System.out.println("| Thue phong theo gio: " + sumSoLuongThueTheoGio + "|");
        System.out.println("| Thue phong theo ngay: " + sumSoLuongThueTheoNgay + "|");
        System.out.println("-------------------------------------");
    }
}
