package Comparable;
import  java.util.*;
class employee implements Comparable<employee>{
    private String first_name;
    private String Last_Name;
    private int age;
    private double salary;

    employee(String first_name, String last_Name,int age,double salary){
        this.first_name=first_name;
        this.Last_Name=last_Name;
        this.age=age;
        this.salary=salary;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_Name(){
        return  Last_Name;
    }
    public void setLast_Name(String last_Name){
        this.Last_Name = Last_Name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "first_name='" + first_name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(employee e) {
        return this.age - e.age;
    }
}

public class CompareMethod {
    public static void main(String[] args) {
        employee mahesh = new employee("Mahesh","Shinde",22,80000);
        employee rushi = new employee("rushi","kathar",24,100000);
        employee avinash = new employee("Avinash","Bhaygude",23,75000);
        employee shubham = new employee("shubham","dhas",20,60000);
        employee anil = new employee("anil","Shivpalk",21,70000);

        List<employee> list = new ArrayList<>();
        list.add(mahesh);
        list.add(rushi);
        list.add(anil);
        list.add(shubham);
        list.add(avinash);

        System.out.println("Before Sorting "+list);

        Collections.sort(list);
        System.out.println("After Sorting "+list);
    }
}
