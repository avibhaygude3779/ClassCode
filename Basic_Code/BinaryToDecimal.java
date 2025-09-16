package Basic_Code;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Binary = sc.nextInt();

        int decimal = 0 ;
        int power= 1;

        for(int i=Binary;i>0; i =i/10){
            int digit = Binary%10;
            if(digit!=0&& digit!=1){
                System.out.println("Invalid Input");
            }
            decimal = decimal+digit*power;
            power*=2;

        }
        System.out.println(decimal);
    }
}
