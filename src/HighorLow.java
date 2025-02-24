import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        boolean validInput;
        String trash;

        do {
            System.out.print("Enter your guess (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Guess must be between 1 and 10.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input try again: " + trash);
                System.out.println("Enter a number between 1 and 10.");
                validInput = false;
            }
        } while (!validInput);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess was too low");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high");
        } else {
            System.out.println("BULLSEYES!!!");
        }
    }
}
