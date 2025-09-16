package JAVA_8.LambdaExpression;
//2. Check if a string is empty using lambda
//Write a Java program to implement a lambda expression to check if a given string is empty.
import java.util.function.Supplier;

interface stringoperation{
    String emptystring();
}
//public class CheckEmptyString {
//    public static void main(String[] args) {
//        String str = "     ";
//        stringoperation string  = ( )-> str.trim().isEmpty()? "String is empty":"String is not empty";
//        System.out.println(string.emptystring());
//    }
//}

// for chechiking the string is emoty or not we use predefined functional interface supplier (Represents a function that takes
// no input and returns a result (T).)
public class CheckEmptyString {
    public static void main(String[] args) {
        String str = "     ";
       Supplier<String> string  = ( )-> str.trim().isEmpty()? "String is empty":"String is not empty";
        System.out.println( );
    }
}
