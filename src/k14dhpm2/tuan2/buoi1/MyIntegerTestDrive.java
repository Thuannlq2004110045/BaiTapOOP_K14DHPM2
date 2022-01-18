package k14dhpm2.tuan2.buoi1;

public class MyIntegerTestDrive {
    public static void main(String[] args) {
        MyInteger m = new MyInteger(20);
        MyInteger m1 = new MyInteger(15);
        boolean lessthan = m.lessThan(m1);
        boolean greaterthan = m.greaterThan(m1);
        System.out.println(lessthan);
        System.out.println(greaterthan);
    }
}
