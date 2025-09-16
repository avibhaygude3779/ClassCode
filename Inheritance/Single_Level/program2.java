package Inheritance.Single_Level;

class Student{
    void fee(){
        System.out.println("Student fee= 60000");
    }
}

class Student_name extends Student {
    void std_name() {
        System.out.println("Name of a Student is Avinash");
    }
}

public class program2 {
    public static void main(String[] args) {
        Student_name obj = new Student_name();
        obj.std_name();
        obj.fee();
    }

}
