import java.util.Scanner;
import java.util.InputMismatchException;

public class Main_01 {
    static int userInput(Scanner SC){
        int num = 0;
        boolean valid = false;
        while (!valid) {
            try{
                System.out.print("Enter your number: ");
                num = SC.nextInt(); // Runtime input validation
                valid = true;
                return num;
            }
            catch(InputMismatchException e){
                System.out.println(e);
                SC.next(); // it clear the invalid input
            }
        }
        return num;
    }
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);

        int val = userInput(SC);
        System.out.println(val);
        SC.close();
        return;
    }
}
