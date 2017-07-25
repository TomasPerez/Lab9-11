import java.util.ArrayList;

/**
 * Created by DELL on 7/23/2017.
 */
public class UsedCar  extends Car{
    private double mileage;

    public UsedCar(String make, String model, int year, double price, double mileage) {
        //let Car's constructor do most of the work
        super(make, model, year, price );

        //this belongs to the subclass so we have to set it here
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        //again, let Car do as much work as possible
        return super.toString() +
                "\t(Used) " + mileage +
                " miles";
    }
}






