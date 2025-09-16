package JAVA_8.Functional_Interface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinary {
    public static void main(String[] args) {
        //unary operator
        UnaryOperator<Integer> un = (x)->x*x;
        System.out.println( un.apply(10));

        //BinaryOperator
        BinaryOperator<String > b = (s1,s2)->s1+s2;
        System.out.println(b.apply("hello","World"));
    }
}
