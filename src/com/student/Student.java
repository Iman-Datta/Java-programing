package src.com.student;

import java.util.Scanner;
import java.util.InputMismatchException;

import src.com.person.Person;

public class Student extends Person{
    int mark;
    String grade;

    // Function for taking input of mark
    public void getMark(Scanner sc){
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Enter your makr: ");
                mark = sc.nextInt();
                valid = true;
            }catch(InputMismatchException e){
                System.out.println("Invalid age, enter integer");
                sc.next(); // Clear buffer
            }
        }
    }
    
    public void claculateGade(){

        if (mark >= 80){
            grade = "A";
        }
        else if(mark >= 60){
            grade = "B";
        }
        else if(mark >= 40){
            grade = "C";
        }
        else
            grade = "Fail";

        displayStudent();
    }

    public void displayStudent(){
        System.out.println("-----Student Report Card -----");
        displayStudent();
        System.out.println("Mark: "+mark);
        System.out.println("Grade: "+grade);
    }
}
