import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        boolean validInput;
        String trash;

        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                if (gallons > 0) {
                    validInput = true;
                } else {
                    System.out.println("Gallons must be greater than zero.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
                validInput = false;
            }
        } while (!validInput);

        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg > 0) {
                    validInput = true;
                } else {
                    System.out.println("Fuel efficiency must be greater than zero.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
                validInput = false;
            }
        } while (!validInput);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon > 0) {
                    validInput = true;
                } else {
                    System.out.println("Price per gallon must be greater than zero.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
                validInput = false;
            }
        } while (!validInput);

        double costFor100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costFor100Miles);
        System.out.printf("The car can travel up to %.2f miles with a full tank.\n", maxDistance);
    }
}
