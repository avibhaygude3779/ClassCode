package JAVA_8.Functional_Interface;

interface parent {
    default void sayHello(){
        System.out.println("in parent sayhello method");
    }
    static void sayBye(){
        System.out.println("Parent static method");
    }

}
interface parent2 {
    default void sayHello(){
    System.out.println("in parent2 sayhello method");
    }
}


public class Default_StaticMethods implements parent,parent2 {
    public static void main(String[] args) {
        Default_StaticMethods obj = new Default_StaticMethods();
        parent.sayBye();
        obj.sayHello();


    }
    // we have to override a method to solve the diamond problem
    @Override
    public void sayHello() {
        parent.super.sayHello();
    }
}
