package Basic_Code;
import java.util.*;
public class PowerIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number which power we have to increment");
        int a = sc.nextInt();
        System.out.println("enter a number which used to power increment");
        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=a;
        }
        System.out.println(ans);
    }
}
