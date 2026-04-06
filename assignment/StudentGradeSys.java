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
            throw new IllegalStateException("No marks entered");
        }

        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.size();
    }

    String grade() {
        double avg = average();

        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }
}

public class StudentGradeSys {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty");
            }

            Student s = new Student(name);

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Subject count must be greater than 0");
            }

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                s.addMark(sc.nextDouble());
            }

            System.out.println("Average = " + s.average());
            System.out.println("Grade = " + s.grade());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric value");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}