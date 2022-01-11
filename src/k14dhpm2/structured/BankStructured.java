package k14dhpm2.structured;

import java.util.Scanner;

public class BankStructured {
    //GLOBAL
    static int account_number = 12345; // số id của tài khoản
    static int account_balance = 0; //số dư của tài khoản
    public static void main(String[] args) {
        //data - dữ liệu
        //các variables (biến)

        Scanner input = new Scanner(System.in);
        //các thao tác operation lên data
        //gửi tiền
        System.out.print("Nhập số tiền gửi > ");
        int inputAmount = input.nextInt();
        account_balance += inputAmount;

        //show
        //thực hiện các lời gọi hàm - function call

        show();

        //withdraw - rút tiền
        int inputWithdrawAmount;
        System.out.print("Nhập số tiền rút > ");
        inputWithdrawAmount = input.nextInt();
        account_balance -= inputWithdrawAmount;

        //show
        //thực hiện các lời gọi hàm - function call

        show();

        //withdraw - rút tiền
        System.out.print("Nhập số tiền rút > ");
        inputWithdrawAmount = input.nextInt();
        account_balance -= inputWithdrawAmount;

        //show
        //thực hiện các lời gọi hàm - function call

        show();

    }

    static void show(){

        System.out.println("Thông tin của tài khoản: ");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }

    void withdraw(){//rút tiền

    }

    void deposit(){//gửi tiền

    }

    static void xyz(){
        account_balance = 0;
    }

    void themNhanVienMoi(){
        account_balance +=  100;

    }

    void inDanhSachNhanVien(){

    }
}
