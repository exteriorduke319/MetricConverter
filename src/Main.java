import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = 0;
        double inches;
        double feet;
        double miles;
        final double METERS_TO_INCHES = 39.37008;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_MILES = 0.00062137;
        boolean metersCheck = false;

        do {
            System.out.print("Please enter a measurement in meters: ");
            if(scan.hasNextDouble()){
                meters = scan.nextDouble();
                if (meters > 0) {
                    metersCheck = true;
                } else {
                    scan.nextLine();
                    System.out.println("Error: invalid value for meter measurement.  Please enter a positive number.");
                }
            } else {
                scan.nextLine();
                System.out.println("Error: invalid value for meter measurement.  Please enter a number.");
            }
        } while (!metersCheck);

        inches = meters * METERS_TO_INCHES;
        feet = meters * METERS_TO_FEET;
        miles = meters * METERS_TO_MILES;
        System.out.printf("Meters: %10.2f", meters);
        System.out.printf("\nInches: %10.2f", inches);
        System.out.printf("\nFeet: %12.2f", feet);
        System.out.printf("\nMiles: %11.2f", miles);
    }
}