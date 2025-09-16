package JAVA_8.LambdaExpression;

interface students{
    String get_name();
    default void get_value(){
        System.out.println("In default method");
    };
}

public class LambdaDemo  {
    public static void main(String[] args) {
        students s = () -> "Mahesh"; // lambda expression
        s.get_value();
        System.out.println(s.get_name());
    }
}
