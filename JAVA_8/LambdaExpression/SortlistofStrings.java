package JAVA_8.LambdaExpression;
//5. Sort strings alphabetically using lambda
//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
import java.util.*;

interface sortStrings{
         void sortString(List<String > list);
}

public class SortlistofStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","java","Python","cpp");
        sortStrings str = (str1)-> Collections.sort(list);
        // ArrayList<String> ar = new ArrayList<>();
        str.sortString(list);

        System.out.println(list);

    }
}

// Using an inbuilt functional interface
//public class SortlistofStrings {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello","java","Python","cpp");
//        Collections.sort(list,(s1,s2)->s1.compareToIgnoreCase(s2));
//        System.out.println(list);
//
//    }
//}