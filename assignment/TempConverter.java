package assignment;

import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
       

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
    }
}