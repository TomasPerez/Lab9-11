/**
 * Created by DELL on 7/20/2017.
 */
public class Car {

    private String carMake;
    private String carModel;
    private int year;
    private double price;

    public Car () {
       carMake = "";
        carModel = "";
        year = 0;
       price = 1.0;
    }

    public Car (String ma, String mo, int y, double p){
        carMake = ma;
        carModel = mo;
        year = y;
        price = p;

    }   public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    public void setCarMake(String ma){
        carMake = ma;
        this.carMake = carMake;

    }
    public void setCarModel(String mo){
        carModel = mo;
        this.carModel = carModel;
    }
    public void setPrice(double p){
        price = p;
        this.price = price;
    }






}
