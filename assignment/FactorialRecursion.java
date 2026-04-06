package assignment;

import java.util.*;

public class FactorialRecursion {
    static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative input not allowed");

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            System.out.println("Factorial = " + factorial(n));

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter an integer value");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}