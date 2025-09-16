package JAVA_8.LambdaExpression;
//16. Check if word exists in list using lambda
//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

interface findString{
    boolean isAvailable(List<String> lst);
}
public class FindWordInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String > list = Arrays.asList("avinash","Mahesh","Vishwa","Soma");
        System.out.println("Enter a String which we want to search");
        String FindWord = sc.next();
        findString check = (s)->{
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i).equals(FindWord)){
                    return true;
                }
            }
            return false;
        };

        boolean isFound = check.isAvailable(list);
        if(isFound){
            System.out.println("String is found");
        }else{
            System.out.println("String is not found");
        }

    }
}
