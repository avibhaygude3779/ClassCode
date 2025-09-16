package Inheritance.Multilevel;

class GrandParent{
    void farm(){
        System.out.println("farm of grandparents");
    }
}
class parent extends GrandParent{
    void house(){
        System.out.println("House of parents");
    }
}
class child extends parent{
    void car(){
        System.out.println("car of a child");
    }
}
public class program1 {
    public static void main(String[] args) {
        child obj = new child();
        obj.farm();
        obj.house();
        obj.car();
    }
}
