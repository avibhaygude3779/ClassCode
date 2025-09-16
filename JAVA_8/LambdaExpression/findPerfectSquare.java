package JAVA_8.LambdaExpression;
//18. Check if number is a perfect square using lambda
//Write a Java program to implement a lambda expression to check if a given number is a perfect square.
import java.util.Scanner;
interface perfectSquare{
    boolean isPerfectSquare(int num);
}
public class findPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which we want to check");
        int num = sc.nextInt();

        perfectSquare check = (n)->{
            int sqrt = (int) Math.sqrt(num);
            if(num<0)return false;
            if(num==sqrt*sqrt)return true;
            return false;
        };
        boolean ans = check.isPerfectSquare(num);
        if(ans){
            System.out.println("The num is perfect square");
        }else{
            System.out.println("The num is not  a perfect square");
        }

    }
}
