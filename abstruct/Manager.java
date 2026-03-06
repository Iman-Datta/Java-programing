//Concrete class

class Manager extends Employee implements Bonus{
    double finalSalary = 0.0;

    public void calculateBonus(){
        finalSalary = finalSalary + (salary * 0.20);
    }

    void calculateSalary(){
        finalSalary = salary + (salary * 0.10);
    }

    void display(){
        System.out.println("----Employee details ------- ");
        System.out.println("Name: "+name);
        System.out.println("Final Salary: "+finalSalary);
    }

}
