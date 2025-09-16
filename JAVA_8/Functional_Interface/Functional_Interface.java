package JAVA_8.Functional_Interface;

@FunctionalInterface
interface  Functional_Interface {
    public void show();
    default void display(){
        System.out.println("In a  default method of functional interface");
    }
    static void print(){
        System.out.println("In a  static method of functional interface");
    }
}
 class Functional_Interface1 implements  Functional_Interface{
     public static void main(String[] args) {
    Functional_Interface1 obj = new Functional_Interface1();
    obj.display();
    obj.show();
    Functional_Interface.print();
     }
     @Override
     public void show() {
         System.out.println("Show method");
         }
 }
 @FunctionalInterface
 interface child extends Functional_Interface{
    public void show(); // parent class abstract method
    // child interface is  functional interface because parent is functional interface and child does not have  any abstract method
    }


