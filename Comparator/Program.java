package Comparator;

import java.util.*;
class student {
    private String first_name;
    private String Last_Name;
    private int age;
    private double salary;

    student(String first_name, String last_Name,int age,double salary){
        this.first_name=first_name;
        this.Last_Name=last_Name;
        this.age=age;
        this.salary=salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "student{" +
                "first_name='" + first_name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
// comparing by age
class compareByAge implements Comparator<student> {
    @Override
    public int compare(student s1, student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

 // comparing by name
class compareByName implements Comparator<student>{
    @Override
    public int compare(student s1,student s2){
        return s1.getFirst_name().compareToIgnoreCase(s2.getFirst_name());
    }
}

//comparing by salary
class compareBysalary implements Comparator<student>{
    @Override
    public int compare(student s1, student s2){
        return Double.compare(s1.getSalary(), s2.getSalary());
    }
}


public class Program {
    public static void main(String[] args) {
        student mahesh = new student("Mahesh","Shinde",22,80000);
        student rushi = new student("rushi","kathar",24,100000);
        student avinash = new student("Avinash","Bhaygude",23,75000);
        student shubham = new student("shubham","dhas",20,60000);
        student anil = new student("anil","Shivpalk",21,70000);

        List<student> hst = new ArrayList<>();
        hst.add(mahesh);
        hst.add(avinash);
        hst.add(anil);
        hst.add(shubham);
        hst.add(rushi);


        System.out.println("list before sorting ");

        for(student s:hst){
            System.out.println(s);
        }
        hst.sort(new compareByAge()); //collections.sort(hst,compareByage())
        System.out.println("list after sorting by age ");

        for(student s:hst){
            System.out.println(s);
        }

        hst.sort(new compareByName());//collections.sort(hst,compareByName())
        System.out.println("list after sorting by firstname ");

        for(student s:hst){
            System.out.println(s);
        }

        hst.sort(new compareBysalary());//collections.sort(hst,compareBysalary())
        System.out.println("list after sorting by salary ");

        for(student s:hst){
            System.out.println(s);
        }

    }
}

/*How this works
Three separate classes implement Comparator<Employee>.

Each compare method defines one specific ordering rule.

In main, we pass a new instance of the required comparator to Collections.sort.

The list is sorted differently each time without modifying the Employee class itself.

Key Points
No need for Employee to implement Comparable here — ordering logic is external.

You can make these comparator classes static inner classes inside Employee if you want them closely related but still separate.

This approach is especially useful when you have multiple sorting criteria and don’t want to cram them into compareTo().*/
