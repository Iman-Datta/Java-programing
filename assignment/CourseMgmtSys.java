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
        System.out.println("Course added successfully");
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

        System.out.println("Student enrolled successfully");
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

    static void displayAllCourses() {
        if (courses.isEmpty()) {
            throw new IllegalStateException("No courses available");
        }

        System.out.println("Available Courses:");
        for (String course : courses.keySet()) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n--- Course Management System ---");
                System.out.println("1. Add Course");
                System.out.println("2. Enroll Student");
                System.out.println("3. Display Students of a Course");
                System.out.println("4. Display All Courses");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                try {
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter course name: ");
                            String courseName = sc.nextLine();
                            addCourse(courseName);
                            break;

                        case 2:
                            System.out.print("Enter course name: ");
                            String cname = sc.nextLine();

                            System.out.print("Enter student name: ");
                            String studentName = sc.nextLine();

                            enroll(cname, studentName);
                            break;

                        case 3:
                            System.out.print("Enter course name: ");
                            String displayCourse = sc.nextLine();
                            display(displayCourse);
                            break;

                        case 4:
                            displayAllCourses();
                            break;

                        case 5:
                            System.out.println("Exiting...");
                            return;

                        default:
                            throw new IllegalArgumentException("Invalid menu choice");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter numeric input");
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
    }
}