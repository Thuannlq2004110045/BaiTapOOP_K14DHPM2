package k14dhpm2.tuan4.buoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> dsXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> dsXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("===========================MENU============================");
            System.out.println("  1.Nhap thong tin cac chuyen xe.                         =");
            System.out.println("  2.Xuat thong tin chuyen xe.                             =");
            System.out.println("  3.Thoat.                                                =");
            System.out.println("===========================================================");
            System.out.print("Lua chon(bang so): ");
            luaChon = scanner.nextInt();
            switch(luaChon){
                case 1:
                int luaChon1;
                do{
                    System.out.println("===========================MENU============================");
                    System.out.println("  1.Nhap thong tin cac chuyen xe noi thanh.               =");
                    System.out.println("  2.Nhap thong tin chuyen xe ngoai thanh.                 =");
                    System.out.println("  3.Thoat.                                                =");
                    System.out.println("===========================================================");
                    System.out.print("Lua chon(bang so): ");
                    luaChon1 = scanner.nextInt();
                    switch(luaChon1){
                        case 1:
                        System.out.print("Nhap so chuyen xe noi thanh: ");
                        soChuyenNoiThanh = scanner.nextInt();
                        System.out.println("Nhap thong tin chuyen xe noi thanh:");
                        for (int i = 0; i < soChuyenNoiThanh; i++) {
                        System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
                        ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
                        chuyenXeNoiThanh.nhapChuyenXe();
                        doanhThuXeNoiThanh += chuyenXeNoiThanh.getDoanhthu();
                        dsXeNoiThanh.add(chuyenXeNoiThanh);
                        }
                        break;

                        case 2:
                        System.out.print("Nhap so chuyen xe ngoai thanh: ");
                        soChuyenNgoaiThanh = scanner.nextInt();
                        System.out.println("Nhap thong tin chuyen xe ngoai thanh:");
                        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
                        System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ":");
                        ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
                        chuyenXeNgoaiThanh.nhapChuyenXe();
                        doanhThuXeNgoaiThanh += chuyenXeNgoaiThanh.getDoanhthu();
                        dsXeNgoaiThanh.add(chuyenXeNgoaiThanh);
                        }
                        break;

                        case 3:
                        luaChon1 = 3;
                    }
                }while(luaChon1 < 3);
                break;
                case 2: 
                int luaChon2;
                do{
                    System.out.println("===========================MENU============================");
                    System.out.println("  1.Xuat thong tin cac chuyen xe noi thanh.               =");
                    System.out.println("  2.Xuat thong tin chuyen xe ngoai thanh.                 =");
                    System.out.println("  3.Thoat.                                                =");
                    System.out.println("===========================================================");
                    System.out.print("Lua chon(bang so): "); 
                    luaChon2 = scanner.nextInt();
                    switch(luaChon2){
                        case 1:
                        System.out.println("-----Thông tin chuyến xe nội thành-----");
                        for (int i = 0; i < dsXeNoiThanh.size(); i++) {
                        System.out.println(dsXeNoiThanh.get(i).toString());
                        }
                        break;

                        case 2:
                        System.out.println("-----Thông tin chuyến xe ngoại thành-----");
                        for (int i = 0; i < dsXeNgoaiThanh.size(); i++) {
                        System.out.println(dsXeNgoaiThanh.get(i).toString());
                        }
                        break;

                        case 3:
                        luaChon2 = 3;
                    }
                }while(luaChon2 < 3);
                break;

                case 3:
                System.exit(0);
            }
        }while(luaChon != 4);
    }
}
