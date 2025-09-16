package JAVA_8.LambdaExpression;
//15. Sum squares of odd/even numbers using lambda
//Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
import java.util.*;
interface calculation{
    int compute(List<Integer> lst);
}
public class sumOfSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        calculation evenSum = (l)->{
            int evenSquareSum = 0;
          for(int n:list){
              if(n%2==0){
                  evenSquareSum = evenSquareSum+(n*n);
              }
          }
          return evenSquareSum;
        };

        calculation oddSum = (l)->{
            int oddSquareSum = 0;
            for(int n:list){
                if(n%2!=0){
                    oddSquareSum = oddSquareSum+(n*n);
                }
            }
            return oddSquareSum;
        };
        System.out.println("The even square sum is: "+evenSum.compute(list));
        System.out.println("The odd square sum is: "+oddSum.compute(list));
    }
}
