package assignment;

import java.util.*;

public class FactorialRecursion {
    static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative input");
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println("Factorial = " + factorial(n));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.next();
        }
        sc.close();
    }
}