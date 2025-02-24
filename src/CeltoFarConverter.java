import java.util.Scanner;

public class CeltoFarConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;
        String trash;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // Clear buffer
                validInput = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid numeric temperature.");
            }
        } while (!validInput);

        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F\n", fahrenheit);
    }
}
