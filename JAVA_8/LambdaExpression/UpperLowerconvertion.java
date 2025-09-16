package JAVA_8.LambdaExpression;
//3. Convert strings to upper/lowercase using lambda
//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
interface stringconversion{
    String upperLowerConversion();
}
public class UpperLowerconvertion {
    public static void main(String[] args) {
        String str = "Hello";
        stringconversion upper = ()-> str.toUpperCase();
        System.out.println("Upper conversion of string: "+upper.upperLowerConversion());

        stringconversion lower = ()->str.toLowerCase();
        System.out.println("lower conversion of string: "+lower.upperLowerConversion());
    }
}

//using build in functional interface
//
//import java.util.function.Function;
//
//public class UpperLowerconvertion {
//    public static void main(String[] args) {
//
//        Function<String, String> upper = (s) -> s.toUpperCase();
//        System.out.println("Upper conversion of string: " + upper.apply("hello"));
//
//        Function<String, String> lower = (s) -> s.toLowerCase();
//
//        System.out.println("lower conversion of string: " + lower.apply("Hello"));
//    }
//}