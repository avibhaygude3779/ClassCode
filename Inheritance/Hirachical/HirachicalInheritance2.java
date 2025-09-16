package Inheritance.Hirachical;

class parent1{
    void farm(){
        System.out.println("Parent class Car");
    }
    void house(){
        System.out.println("Parent class house");
    }
}

class child_1 extends parent1{

    void bike(){
        System.out.println("Bike of child1");
    }
}
class Child_2 extends parent1{
    void car(){
        System.out.println("car of child2");

    }
}
public class HirachicalInheritance2 {
    public static void main(String[] args) {
        child_1 obj = new child_1(); // child1 class object
        obj.farm();// parent class method inherited by child1
        obj.house();// parent class method inherited by child1
        obj.bike();// child1 class method
        Child_2 obj2 = new Child_2();
        obj2.farm();//parent class method inherited by child2
        obj2.house();//parent class method inherited by child2
        obj2.car();//child2 class method
    }
}
