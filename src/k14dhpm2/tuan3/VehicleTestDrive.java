package k14dhpm2.tuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> listVehicle;
        listVehicle = new ArrayList<>();
        int luaChon;
        do{
            System.out.println("===========================MENU============================");
            System.out.println("  1.Nhap thong tin xe.                                    =");
            System.out.println("  2.Xuat bang ke khai tien thue truoc ba cua xe.          =");
            System.out.println("  3.Thoat.                                                =");
            System.out.println("===========================================================");
            System.out.print("Lua chon(bang so): ");
            luaChon = scanner.nextInt();
            switch(luaChon){
                case 1:
                Vehicle vehicle = new Vehicle();
                vehicle.input();
                listVehicle.add(vehicle);
                break;

                case 2:
                for(int i = 0; i<listVehicle.size();i++){
                    System.out.println(listVehicle.get(i));
                }
                break;

                case 3:
                System.exit(0);
            }
        }while(true);
    }
}
