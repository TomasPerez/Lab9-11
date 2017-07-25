/**
 * Created by DELL on 7/20/2017.
 */
public class Car {

    private String carMake;
    private String carModel;
    private int year;
    private double price;


    public Car () {
       this.carMake = "";
        this.carModel = "";
        this.year = 0;
       this.price = 1.0;
    }
    public String getCarMake() {
        return carMake;
    }
    public void setcarMake(String carMake){
        this.carMake = carMake;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setcarModel(String carModel){
        this.carModel = carModel;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return year + "\t" + carMake + "\t" + carModel + "\t" + price;
    }
}
