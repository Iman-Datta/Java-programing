import java.util.Scanner;

public class MainAppCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // We need to create an Object
        Calculator ref = new Calculator();
        System.out.println("Enter three numbers: ");
        int nOne = sc.nextInt();
        int nTwo = sc.nextInt();
        int nThree = sc.nextInt();

        System.out.println("Enter two decimal numbers: ");
        double nDec_One = sc.nextDouble();
        double nDec_Two = sc.nextDouble();

        System.out.println("Sum of two numbers: "+ref.add(nOne, nTwo));
        System.out.println("Sum of three numbers: "+ref.add(nOne, nTwo, nThree));
        System.out.println("Sum of two decimal numbers: "+ref.add(nDec_One, nDec_Two));
        sc.close();
    }
}

class Calculator{
    // Method OverLoading: Multiple methods having same name but with different number parameter's
    // We can have same number of Parameters but the data-type are different

    // 2 Parametes of type int
    int add(int a, int b){
        return a+b;
    }

    // 2  Parametes of type double
    double add(double a, double b){
        return a+b;
    }

    // 3 Parameters
    int add(int a, int b, int c){
        return a+b+c;
    }
}
