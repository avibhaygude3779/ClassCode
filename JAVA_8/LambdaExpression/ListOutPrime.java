package JAVA_8.LambdaExpression;
//21. Sum all primes in range using lambda
//Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
import java.util.List;
import  java.util.Scanner;
interface findPrime{
    boolean PrimeNum(int num);
}
public class ListOutPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting of range");
        int startRange = sc.nextInt();
        System.out.println("Enter a ending of rage");
        int endRange=sc.nextInt();

        primeNum op = (num)->{
            if(num<=1)return false;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)return false;
            }
            return true;
        };

        int sum = 0;
        for(int i =startRange;i<endRange;i++){
            if(op.isPrime(i)){
                sum+=i;
            }
        }
        System.out.println("Sum of prime number is: "+sum);
    }
}
