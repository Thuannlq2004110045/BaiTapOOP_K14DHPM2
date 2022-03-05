package k14dhpm2.tuan3;

import java.util.Scanner;

public class Vehicle {
    private String vehicleownersname;
    private String kindofvehicle;
    private int cylindercapacity;
    private double price;

    public void Vehicle(){};

    public void Vehicle(String vehicleownersname, String kindofvehicle, int cylindercapacity, double price){
        this.vehicleownersname = vehicleownersname;
        this.kindofvehicle = kindofvehicle;
        this.cylindercapacity = cylindercapacity;
        this.price = price; 
    }

    public void setVehicleOwnersName(String vehicleownersname){
        this.vehicleownersname = vehicleownersname;
    }

    public String getVehicleOwnersName(){
        return this.vehicleownersname;
    }

    public void setKindOfVehicle(String kindofvehicle){
        this.kindofvehicle = kindofvehicle;
    }

    public String getKindOfVehicle(){
        return this.kindofvehicle;
    }

    public void setCylinderCapacity(int cylindercapacity){
        this.cylindercapacity = cylindercapacity;
    }

    public int getCylinderCapacity(){
        return this.cylindercapacity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten chu xe: ");
        this.vehicleownersname = scanner.nextLine();
        System.out.println("Nhap loai xe: ");
        this.kindofvehicle = scanner.nextLine();
        System.out.println("Nhap dung tich xi lanh: ");
        this.cylindercapacity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gia tri xe: ");
        this.price = scanner.nextDouble();
        scanner.nextLine();
    }

    public double taxCalculation(int cylindercapacity){
        double tax = 0;
        if(cylindercapacity < 100){
            tax = this.price*0.01;
        }
        if(cylindercapacity >= 100 & cylindercapacity <= 200){
            tax = this.price*0.03;
        }
        if(cylindercapacity > 200){
            tax = this.price*0.05;
        }
        return tax;
    }

    public String toString(){
        String str = "Ten chu xe: " + this.vehicleownersname + "      loai xe: " + this.kindofvehicle + "       Dung tich xi lanh: " + this.cylindercapacity + "        gia tri xe: " +  this.price + "         Thue truoc ba: " + this.taxCalculation(cylindercapacity);
        return str;
    }
}
