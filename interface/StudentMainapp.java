// An interface is a container that contains abstract methods. 
// An abstract method is a method that has a declaration but no definition.

import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentMainapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();   // Object creation

        student.getPersonalInfo(sc);
        student.getAcademicInfo(sc);
        student.calculateGrade();

        sc.close();
    }
}


// Interface for Personal Information
interface PersonalInfo {
    void getPersonalInfo(Scanner sc);
}


// Interface for Academic Information
interface AcademicInfo {
    void getAcademicInfo(Scanner sc);
    void calculateGrade();
}


// Student class implementing both interfaces
class Student implements PersonalInfo, AcademicInfo {

    private String name;
    private int roll;
    private double mark;

    public void getPersonalInfo(Scanner sc) {

        System.out.print("Enter student name: ");
        name = sc.next();

        roll = getInt(sc, "Enter roll number: ");
    }

    public void getAcademicInfo(Scanner sc) {

        mark = getDouble(sc, "Enter mark: ");
    }

    public void calculateGrade() {

        String grade;

        if (mark >= 80)
            grade = "A";
        else if (mark >= 60)
            grade = "B";
        else if (mark >= 40)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\n----- Student Result -----");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Mark : " + mark);
        System.out.println("Grade: " + grade);
    }


    // Integer validation
    private int getInt(Scanner sc, String msg) {

        while (true) {
            try {
                System.out.print(msg);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid integer! Try again.");
                sc.next();
            }
        }
    }


    // Double validation
    private double getDouble(Scanner sc, String msg) {

        while (true) {
            try {
                System.out.print(msg);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number! Try again.");
                sc.next();
            }
        }
    }
}