package Basic_Code;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0;
        int temp = num;
        while(num!=0){
            int digit = num%10;
            sum = sum+(digit*digit*digit);
            num=num/10;
        }
        if(sum==temp){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }
    }
}
