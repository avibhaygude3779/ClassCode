package Inheritance.Single_Level;

class Employee{
    void Salary(){
        System.out.println("Employee Salary 60000");
    }
}

class Employee_name extends Employee {
    void emp_name() {
        System.out.println("Name of a Employee is Avinash");
    }
}

public class program3 {
    public static void main(String[] args) {
        Employee_name obj1 = new Employee_name();
        obj1.emp_name();
        obj1.Salary();
    }

}
