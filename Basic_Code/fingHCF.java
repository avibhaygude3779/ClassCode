package Basic_Code;
import java.util.*;
public class fingHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a first num");
        int firstnum = sc.nextInt();
        System.out.println("Enter a second number");
        int secondnum = sc.nextInt();
        int limit = Math.min(firstnum,secondnum);
        int max = 1;
        for(int i=1;i<=limit;i++){
            if(firstnum%i==0 && secondnum%i==0){

                    max=i;

            }
        }
        System.out.println(max);
    }
}
