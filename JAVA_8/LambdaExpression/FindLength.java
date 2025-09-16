package JAVA_8.LambdaExpression;


import java.util.Arrays;
import java.util.List;

//17. Find longest and shortest string using lambda
//Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
interface smallAndLargeString{
    String compute(List<String> str);
}

public class FindLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Avinash","mahesh","Vishwa","soma","sujal");
        smallAndLargeString checkLargeStr = (l)->{
            String maxstr = list.get(0);
            for (String str:list){
                if(str.length()>maxstr.length()){
                    maxstr=str;
                }
            }
            return maxstr;
        };
        smallAndLargeString checkSmallStr = (l)->{
            String smallstr = list.get(0);
            for (String str:list){
                if(str.length()<smallstr.length()){
                    smallstr=str;
                }
            }
            return smallstr;
        };
        System.out.println("Large string in list is: "+ checkLargeStr.compute(list));
        System.out.println("small string in list is: "+ checkSmallStr.compute(list));

    }
}
