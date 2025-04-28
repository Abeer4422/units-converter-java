/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        System.out.print("Choose an option (1, 2, 3 or 4): ");
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
}

