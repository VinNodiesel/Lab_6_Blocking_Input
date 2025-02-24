import java.util.Scanner;

public class Rectangle_Info {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validInput;
        String trash;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {
                    validInput = true;
                } else {
                    System.out.println("Width must be greater than zero.");
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
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) {
                    validInput = true;
                } else {
                    System.out.println("Height must be greater than zero.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
                validInput = false;
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("The area of the rectangle is: %.2f\n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f\n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f\n", diagonal);
    }
}
