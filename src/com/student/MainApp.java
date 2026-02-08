package src.com.student;

import java.util.Scanner;
// import java.util.InputMismatchException;

public class MainApp {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("-----Student managment system-----");

        student.getInput(sc);
        student.getMark(sc);
        student.claculateGade();
        sc.close();
    }
}
