package Basic_Code;
import  java.util.*;
public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = sc.nextInt();
        StringBuilder octal = new StringBuilder();

        while (decimal!=0){
            int rem = decimal%8;
            octal.insert(0,rem);
            decimal = decimal/8;
        }
        System.out.println(octal);
    }
}
