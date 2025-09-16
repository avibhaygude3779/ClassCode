package JAVA_8.LambdaExpression;
//12. Multiply and sum list elements using lambda
//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
import java.util.Arrays;
import java.util.List;
interface MinAndMax{
    int operation(List<Integer> list);
}
public class MulAndAddOfllist {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(10,7,8,5,4,2,6);
       MinAndMax add=(l)->{
           int sum = 0;
           for(int n:list){
              sum+=n;
           }
         return sum;
       };

        MinAndMax multiplication=(l)->{
            int mul = 1;
            for(int n:list){
                mul*=n;
            }
            return mul;
        };

        System.out.println("Sum of list Numbers: "+ add.operation(list));
        System.out.println("multiplication  of list Numbers: "+ multiplication.operation(list));
    }
}
