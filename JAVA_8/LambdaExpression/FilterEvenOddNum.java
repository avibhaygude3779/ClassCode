package JAVA_8.LambdaExpression;
//4. Filter even and odd numbers with lambda
//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface evenodd{
    boolean test(int n);

}
public class FilterEvenOddNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,2,5,7,8,6,2,4,9,6,2,2,55,22,44,33,88,42);

        evenodd iseven  = (n)-> n%2==0;
        evenodd isodd =(n)->n%2!=0;

        ArrayList<Integer> Even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int n: numbers){
            if(iseven.test(n)){
                Even.add(n);
            }else {
                odd.add(n);
            }
        }
        System.out.println("Even number ;"+ Even);
        System.out.println("Odd Number :"+ odd);

    }
}
