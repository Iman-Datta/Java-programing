package assignment;

import java.util.*;

public class AverageCalc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many numbers? ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Number count must be greater than 0");
            }

            double sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                sum += sc.nextDouble();
            }

            double avg = sum / n;
            System.out.println("Average = " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric input");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}