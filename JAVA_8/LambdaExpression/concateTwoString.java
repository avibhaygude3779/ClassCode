package JAVA_8.LambdaExpression;
//10. Concatenate two strings using lambda
//Write a Java program to implement a lambda expression to concatenate two strings
interface string_operation{
    String concate(String str1,String str2);
}
public class concateTwoString {
    public static void main(String[] args) {
        string_operation join = (s1,s2)->s1+s2;
        String s1="hello";
        String s2="java";

        System.out.println(join.concate(s1,s2));
    }
}
