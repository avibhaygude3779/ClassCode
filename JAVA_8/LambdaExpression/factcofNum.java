package JAVA_8.LambdaExpression;
//8. Calculate factorial using lambda expression
//Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
import java.util.*;
interface factorial{
    int compute(int n);
}
public class factcofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        factorial factorial = (n)-> {
            int fact = 1;
            for(int i=1;i<=num;i++){
              fact*=i;
          }
            return fact;
        };
        System.out.println("Factorial of number is : ");
        System.out.println(factorial.compute(num));
    }
}
