package assignment;

import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            String str = sc.nextLine();

            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("String cannot be empty");
            }

            String rev = new StringBuilder(str).reverse().toString();

            if (str.equalsIgnoreCase(rev))
                System.out.println(str + " is a palindrome");
            else
                System.out.println(str + " is NOT a palindrome");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}