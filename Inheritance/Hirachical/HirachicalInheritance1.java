package Inheritance.Hirachical;

//parent class
class Parent {
    void method() {
        System.out.println("parent class menthod");
    }
}
//child1 class
class child1 extends Parent{
    void method2(){
        System.out.println("child1 class method2");
    }

}
//child2 class
class child2 extends Parent{
    void method3(){
        System.out.println("child2 class method3");
    }
}

public class HirachicalInheritance1 {
    public static void main(String[] args) {
      child1 obj2 = new child1();
      obj2.method();
      obj2.method2();
      child2 obj = new child2();
      obj.method(); // parents class method
      obj.method3(); // child2 class method
    }


}
