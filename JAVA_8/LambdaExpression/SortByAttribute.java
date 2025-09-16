package JAVA_8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

//Sort objects by attribute using lambda
//Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
class Employee {
    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public  int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class SortByAttribute {
    public static void main(String[] args) {
        Employee mahesh = new Employee("Mahesh",23,75000);
        Employee anil = new Employee("Anil",22,65000);
        Employee shubham = new Employee("Shubham",21,70000);
        Employee soma = new Employee("Somanath",24,100000);
        Employee avi = new Employee("avinash",22,70000);
        Employee vishwa = new Employee("vishwjeet",23,95000);

        List<Employee> emp = new ArrayList<>();
        emp.add(mahesh);
        emp.add(anil);
        emp.add(avi);
        emp.add(soma);
        emp.add(vishwa);
        emp.add(shubham);
        System.out.println("Sorting by age: ");
        //sorting by age
        emp.sort((e1,e2)-> e1.getAge()- e2.getAge());
        for(Employee e:emp) {
            System.out.println(e);
        }
        System.out.println("<------------------------------------------------------------>");
        System.out.println("Sorting by name: ");
        //sorting by name
        emp.sort((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName()));
        for(Employee e:emp) {
            System.out.println(e);
        }
        System.out.println("<--------------------------------------------------------------->");
        System.out.println("Sorting by salary: ");
        //compare by salary
        emp.sort((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));

        for(Employee e:emp){
            System.out.println(e);
        }
    }
}
