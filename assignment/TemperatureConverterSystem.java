package assignment;

import java.util.*;

abstract class TempConverter {
    abstract double toC(double val);
    abstract double fromC(double c);
}

class FahrenheitConverter extends TempConverter {
    double toC(double f) {
        return (f - 32) * 5 / 9;
    }

    double fromC(double c) {
        return c * 9 / 5 + 32;
    }
}

class KelvinConverter extends TempConverter {
    double toC(double k) {
        if (k < 0)
            throw new IllegalArgumentException("Temperature cannot be below absolute zero");
        return k - 273.15;
    }

    double fromC(double c) {
        if (c < -273.15)
            throw new IllegalArgumentException("Temperature below absolute zero");
        return c + 273.15;
    }
}

public class TemperatureConverterSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            TempConverter f = new FahrenheitConverter();
            TempConverter k = new KelvinConverter();

            System.out.println("---- Temperature Converter ----");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            System.out.print("Enter temperature value: ");
            double temp = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + f.fromC(temp) + " F");
                    break;

                case 2:
                    System.out.println("Result = " + f.toC(temp) + " C");
                    break;

                case 3:
                    System.out.println("Result = " + k.fromC(temp) + " K");
                    break;

                case 4:
                    System.out.println("Result = " + k.toC(temp) + " C");
                    break;

                default:
                    throw new IllegalArgumentException("Invalid choice");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid numeric input");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}