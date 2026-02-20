package constructor;

import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    private double marks;

    // Defult constructor
    public Student(){
        this.name = "";
        this.roll = 0;
        this.marks = 0.0;
    }
    // Parameterized constructor
    public Student(String name, int roll, double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Copy constructor
    public Student(Student obj){
        this.name = obj.name;
        this.roll = obj.roll;
        this.marks = obj.marks;
    }

    public void takeInput(Scanner sc){

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        roll = sc.nextInt();
        System.out.print("Enter your total marks: ");
        marks = sc.nextDouble();
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll);
        System.out.println("Marks: "+marks);
    }
}

public class StudentMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Defult constructor
        Student s1 = new Student();
        s1.takeInput(sc);
        s1.display();

        // Parameterized constructor
        Student s2 = new Student("Iman Datta", 13, 8.84);
        s2.display();

        Student s3 = new Student(s2);
        s3.display();
        
        sc.close();
    }
}