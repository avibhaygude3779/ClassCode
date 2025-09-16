package Inheritance.Single_Level;

class college{
    void  clg_name(){
        System.out.println("tssm bscoer narhe");
    }
    void std_count(){
        System.out.println("std count is 720");
    }
}
class student extends college{
    void Roll_no(){
        System.out.println("std roll number is 08");
    }
    void Std_name(){
        System.out.println("Std name is Avinash");
    }
}
public class program4 {
    public static void main(String[] args) {
        student obj = new student();
        obj.clg_name();
        obj.std_count();
        obj.Roll_no();
        obj.Std_name();
    }
}
