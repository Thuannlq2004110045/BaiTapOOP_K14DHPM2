package k14dhpm2.tuan3;

public class Car {
    
    private String carColor;
    private double carPrice = 0.0;

    public String getCarColor(){
        return this.carColor;
    }

    public void setCarColor(String color){
        this.carColor = color;
    }

    public double getCarPrice(){
        return this.carPrice;
    }

    public void setCarPrice(Double price){
        this.carPrice = price;
    }
}
