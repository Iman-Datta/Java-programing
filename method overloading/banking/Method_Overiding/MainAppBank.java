import java.util.Scanner;

public class MainAppBank {
    public static void main(String[] args) {
        SBI sRef = new SBI();
        sRef.getData();
        sRef.calculateInterest();
    }
}


class Bank{
    double principal;
    int time;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prinicipal: ");
        principal = sc.nextDouble();
        System.out.println("Enter the time: ");
        time = sc.nextInt();
        sc.close();
    }

    void calculateInterest(){
        double rate = 5;
        double interest = (principal*rate*time)/100;
        System.out.println("Interest: "+interest);
    }

}


class SBI extends Bank{

    // @Override tells the compiler to override a super class method
    // If no matching method exist-> Compiler Error
    @Override
    void calculateInterest(){
        double rate = 6;
        double interest = (principal*rate*time)/100;
        System.out.println("Interest: "+interest);
    }
}
