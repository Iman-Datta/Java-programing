import java.util.Scanner;

abstract class Employee {
    public String name;
    public double salary;

    void getEmployee(Scanner sc){
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
    }

    abstract void calculateSalary();
}
