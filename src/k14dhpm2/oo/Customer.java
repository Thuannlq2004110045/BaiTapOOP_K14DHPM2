package k14dhpm2.oo;

public class Customer {
    
    //data
    String name;
    String address;

    //operation
    //functions
    void getName(String ten){

        //code
        name = ten;

    }

    void getAddress(String diachi){

        //code
        address = diachi;

    }

    void show(){

        System.out.println("Thông tin Customer: ");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
