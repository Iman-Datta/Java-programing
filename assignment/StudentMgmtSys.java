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
        return marks.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}

public class StudentMgmtSys {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            Student s = new Student(name);

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Subjects must be greater than 0");
            }

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                s.addMark(sc.nextDouble());
            }

            System.out.println("Average marks: " + s.average());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}