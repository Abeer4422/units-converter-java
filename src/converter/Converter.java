package converter;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Meters to Centimeters");
        System.out.println("2. Centimeters to Meters");
        System.out.println("3. Kilograms to Pounds");
        System.out.println("4. Pounds to Kilograms");
        System.out.println("5. Celsius to Fahrenheit");
        System.out.println("6. Fahrenheit to Celsius");
        System.out.println("7. Celsius to Kelvin");
        System.out.println("8. Kelvin to Celsius");
        System.out.print("Choose an option (1, 2, 3 ,4,5 or 7): ");
        int option = scanner.nextInt();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        double result = 0;

        if (option == 1) {
            result = metersToCentimeters(value);
            System.out.println(value + " meters = " + result + " centimeters");
        } else if (option == 2) {
            result = centimetersToMeters(value);
            System.out.println(value + " centimeters = " + result + " meters");
        } else if (option == 3) {
            result = kilogramsToPounds(value);
            System.out.println(value + " kilograms = " + result + " pounds");
        } else if (option == 4) {
            result = poundsToKilograms(value);
            System.out.println(value + " pounds = " + result + " kilograms");
        } else if (option == 5) {
            result = celsiusToFahrenheit(value);
            System.out.println(value + " Celsius = " + result + " Fahrenheit");
        } else if (option == 6) {
            result = fahrenheitToCelsius(value);
            System.out.println(value + " Fahrenheit = " + result + " Celsius");
        } else if (option == 7) {
            result = celsiusToKelvin(value);
            System.out.println(value + " Celsius = " + result + " Kelvin");
        } else if (option == 8) {
            result = kelvinToCelsius(value);
            System.out.println(value + " Kelvin = " + result + " Celsius");
        } else {
            System.out.println("Invalid option.");
        }

    }

    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}
