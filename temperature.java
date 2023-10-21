import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Temperature Conversion Menu:");
            System.out.println("1. Convert from Celsius to Fahrenheit");
            System.out.println("2. Convert from Fahrenheit to Celsius");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1/2/3): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    convertCelsiusToFahrenheit();
                    break;
                case 2:
                    convertFahrenheitToCelsius();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        } while (choice != 3);
    }

    public static void convertCelsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void convertFahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
