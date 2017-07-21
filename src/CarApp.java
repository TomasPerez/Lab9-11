import java.util.Scanner;

/**
 * Created by DELL on 7/20/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usermake;
        String usermodel;
        int userYear;
        double p;

        System.out.println("Hello and Welcome to Grand Circus Motors! ");

        System.out.print("Please enter a car make: ");
        String userMake = scan.nextLine();
        car1.setCarMake(userMake);

        System.out.print("Please enter a car model: ");
        String userModel = scan.nextLine();
        car1.setcarModel(userModel);

        System.out.println("Please enter car year: ");
        userYear = scan.nextInt();
        car1.setuserYear(userYear);

        System.out.println("Please enter car price: ");
        double p = scan.nextDouble();





    }
}