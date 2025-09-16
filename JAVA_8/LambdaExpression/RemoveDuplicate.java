package JAVA_8.LambdaExpression;
//7. Remove integer duplicates using lambda
//Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface removeduplicatelist{
    List<Integer> removeduplicate(List<Integer> list);
}
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,6,6,7,8);
        ArrayList<Integer> ar = new ArrayList<>();
        removeduplicatelist redulist = (list1)->{
          for(int num:list){
              if(!ar.contains(num)){
                  ar.add(num);
              }
          }
            return ar;
        };
        System.out.println(redulist.removeduplicate(list));
    }
}
