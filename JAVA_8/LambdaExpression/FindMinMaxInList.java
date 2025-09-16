package JAVA_8.LambdaExpression;
//11. Find max and min in list using lambda
//Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
import java.util.Arrays;
import java.util.List;
import java.util.Set;

interface findminmax{
    int compute(List<Integer> lst);
}
public class FindMinMaxInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,4,2,10,58,96,78,20,1,58,4,63,4);

        findminmax findmin =(l)->{
            int min = list.get(0);
            for(int i:list){
                if(min>i){
                    min=i;
                }
            }
            return min;
        };

        findminmax findmax =(l)->{
            int max = list.get(0);
            for(int i:list){
                if(max<i){
                    max=i;
                }
            }
            return max;
        };

        System.out.println("min of list : "+findmin.compute(list));
        System.out.println("Max of list : "+findmax.compute(list));
    }
}
