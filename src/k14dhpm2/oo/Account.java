package k14dhpm2.oo;

public class Account {
    
    //data
    int account_number;
    int account_balance;

    //operation
    //functions
    void deposit(int amount){

        //code
        account_balance += amount;

    }

    void withdraw(int amount){

        //code
        account_balance -= amount;

    }

    void show(){

        //code
        System.out.println("Thông tin của tài khoản: ");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
        
    }
}
