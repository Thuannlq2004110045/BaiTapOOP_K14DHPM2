package k14dhpm2.tuan3;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("vang");
        car.setCarPrice(500000.0);
        System.out.println("car color: " + car.getCarColor());
        System.out.println("car price: " + car.getCarPrice());
    }
}
