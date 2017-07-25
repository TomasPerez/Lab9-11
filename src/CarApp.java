import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DELL on 7/20/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String userMake ;
        String userModel ;
        int userYear ;
        double price = 0.0;
        Car Car1 = new Car();

        System.out.println("Hello and Welcome to Grand Circus Motors! ");
        System.out.println("Follow the intructions below. ");

        ArrayList<Car> roster = new ArrayList<Car>();

        roster.add(new Car("Cadillac", "Escalade", 2017, 45999.90));
        roster.add(new Car("Ford", "Fusion", 2017, 27500.99));
        roster.add(new Car("Chevy", "Stingray", 2017, 70500.99));
        roster.add(new UsedCar("Honda", "S2000", 2009, 53500.99, 12745.8, " used"));
        roster.add(new UsedCar("Toyota", "Corolla", 1987, 5500.99, 288.5, " used"));
        roster.add(new UsedCar("Honda", "Crv", 2004, 6500.99, 8888.30, " used"));

        int s = 1;

        for (Car s: roster){
            System.out.println();

    }
}