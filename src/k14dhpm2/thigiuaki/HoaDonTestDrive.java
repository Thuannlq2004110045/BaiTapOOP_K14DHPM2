package k14dhpm2.thigiuaki;

import java.text.ParseException;
import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) throws ParseException {
        int x;
        Scanner scanner = new Scanner(System.in);

        ListHoaDon dshoadon = new ListHoaDon();
        do{
            System.out.println("---------------------------------------");
            System.out.println("1. Them hoa don theo gio");
            System.out.println("2. them hoa don theo ngay");
            System.out.println("3. hien thi danh muc hoa don");
            System.out.println("4. tinh tong so luong tung loai thue phong");
            System.out.println("5. tinh trung binh thanh tien hoa don thue phong");
            System.out.println("6. thoat");
            x = scanner.nextInt();
            System.out.println("---------->>");
            switch(x)
            {
                case 1: 
                    dshoadon.Listhoadon(1);
                    break;
                case 2: 
                    dshoadon.Listhoadon(2);
                    break;
                case 3:
                    dshoadon.xuattt();
                    break;
                case 4:
                    dshoadon.tinhTongSoLuongThuePhong();
                    break;
                case 5:
                    dshoadon.tinhTBThanhTien();
                    break;
                case 6:
                    System.exit(0);
            }
        }while(x!=0);
        System.out.println("");
    }
}
