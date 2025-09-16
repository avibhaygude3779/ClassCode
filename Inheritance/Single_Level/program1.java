package Inheritance.Single_Level;

class parent{
    void method1(){
        System.out.println("In a parent class method");
    }
}

class child extends parent{
    void method2(){
        System.out.println("In a Child class method");
    }
}
public class program1 {
    public static void main(String[] args) {

        child obj = new child();
        obj.method1();// parent class method
        obj.method2();// child class method
    }
}
