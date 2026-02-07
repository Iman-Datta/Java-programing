package calculatorpack;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Mainapp {

    private static int getIn(Scanner sc, String msg){
        int num = -1;
        boolean valid = false;
        while(!valid){
            try{
                System.out.print(msg);
                num = sc.nextInt();
                valid = true;
            } catch(InputMismatchException e){
                System.out.println("Give valid input");
                sc.next();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();


        int nOne = getIn(sc, "Enter your first number: ");
        int nTwo = getIn(sc, "Enter your second number: ");

        int sum = cal.add(nOne, nTwo);
        int product = cal.multiplication(nOne, nTwo);

        System.out.println("The sumation of "+nOne+ "and "+nTwo+" is: " +sum);
        System.out.println("The product of "+nOne+ "and "+nTwo+" is: " +product);
        
        sc.close();
        return;
    }
}
