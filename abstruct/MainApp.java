import java.util.*;

public class MainApp {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();

        m.getEmployee(sc);
        m.calculateSalary();
        m.calculateBonus();
        m.display();
        
        sc.close();
   }
}
