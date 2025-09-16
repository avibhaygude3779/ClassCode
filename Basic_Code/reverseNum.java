package Basic_Code;
import  java.util.*;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int ans=0;
        while(num!=0){
            int digit = num%10;
            ans = ans*10+digit;
            num = num/10;
        }
        System.out.println(ans);
    }
}
