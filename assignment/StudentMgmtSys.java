package assignment;

import java.util.*;

class Student {
    String name;
    ArrayList<Double> marks = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addMark(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        marks.add(mark);
    }

    double average() {
        if (marks.isEmpty()) {
            throw new IllegalStateException("No marks available");
        }

        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.size();
    }

    void displayMarks() {
        if (marks.isEmpty()) {
            throw new IllegalStateException("No marks entered");
        }

        System.out.println("Marks: " + marks);
    }
}

public class StudentMgmtSys {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            Student s = new Student(name);

            while (true) {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Mark");
                System.out.println("2. Display Average");
                System.out.println("3. Display All Marks");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                try {
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter mark: ");
                            double mark = sc.nextDouble();
                            s.addMark(mark);
                            System.out.println("Mark added successfully");
                            break;

                        case 2:
                            System.out.println("Average marks: " + s.average());
                            break;

                        case 3:
                            s.displayMarks();
                            break;

                        case 4:
                            System.out.println("Exiting...");
                            return;

                        default:
                            throw new IllegalArgumentException("Invalid menu choice");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter numeric input");
                    sc.nextLine(); // clear invalid input
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}