package src.com.person;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Person {
    // Class member variable
    protected String name;
    protected int age;

    // Function for taking input
    public void getInput(Scanner sc){
        System.out.println("Enter your name: ");
        name = sc.next();

        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Enter your age: ");
                age = sc.nextInt();
                valid = true;
            }catch(InputMismatchException e){
                System.out.println("Invalid age, enter integer");
                sc.next(); // Clear buffer
            }
        }
    }

    // Function for giving output
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
