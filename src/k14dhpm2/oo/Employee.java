package k14dhpm2.oo;

public class Employee {
    
    //data
    String name;
    float salary;

    //operation
    //functions
    void getName(String ten){

        //code
        name = ten;

    }

    void getSalary(float amount){

        //code
        salary = amount;

    }

    void show(){

        System.out.println("Thông tin Employee: ");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        
    }
}
