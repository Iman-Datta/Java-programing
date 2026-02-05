import java.util.Scanner;

public class ArrayInputAndAverage {

    // Method to take array input
    static int[] takeInput(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter ages:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to calculate sum
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to calculate average
    static double calculateAverage(int sum, int n) {
        return (double) sum / n;
    }

    // Method to display array
    static void displayArray(int[] arr) {
        System.out.print("Ages: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = takeInput(sc);
        displayArray(ages);

        int sum = calculateSum(ages);
        double avg = calculateAverage(sum, ages.length);

        System.out.println("Sum of ages: " + sum);
        System.out.println("Average age: " + avg);

        sc.close();
    }
}