package JAVA_8.LambdaExpression;
//9. Check if number is prime using lambda
//Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
import java.util.Scanner;

interface primeNum{
    boolean isPrime(int num);
}
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        primeNum check = (n) -> {
            for (int i=2;i<n;i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
        System.out.println("Enter number whose  want to check");
       boolean primeCheck =  check.isPrime(sc.nextInt());
       if(primeCheck){
           System.out.println("The num is prime number");
       }else{
           System.out.println("The num is not a prime number");
       }
    }
}

