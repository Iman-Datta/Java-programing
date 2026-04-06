package assignment;

import java.util.*;

public class CourseMgmtSys {
    static HashMap<String, HashSet<String>> courses = new HashMap<>();

    static void addCourse(String cname) {
        if (cname == null || cname.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }

        if (courses.containsKey(cname)) {
            throw new IllegalArgumentException("Course already exists");
        }

        courses.put(cname, new HashSet<>());
    }

    static void enroll(String cname, String student) {
        if (!courses.containsKey(cname)) {
            throw new IllegalArgumentException("No such course");
        }

        if (student == null || student.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }

        if (!courses.get(cname).add(student)) {
            throw new IllegalArgumentException("Student already enrolled");
        }
    }

    static void display(String cname) {
        if (!courses.containsKey(cname)) {
            throw new IllegalArgumentException("Course not found");
        }

        System.out.println("Students enrolled in " + cname + ":");
        for (String s : courses.get(cname)) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter course name: ");
            String courseName = sc.nextLine();

            addCourse(courseName);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter student " + i + " name: ");
                String studentName = sc.nextLine();
                enroll(courseName, studentName);
            }

            display(courseName);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric input");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}