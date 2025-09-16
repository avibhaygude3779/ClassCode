package Basic_Code;

import java.util.Scanner;

public class hexdecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexa = sc.nextLine().toUpperCase();

        int decimal = 0;
        int power = 1;

        for (int i = hexa.length()-1 ; i >=0; i--) {
            char ch = hexa.charAt(i);

            int digit;
            if (ch <= '9' && ch >='0') {
                digit = ch - '0';
            }else if(ch>='A' && ch<='F'){
                digit = ch-'A'+10;
            }else {
                System.out.println("invalid input");
                return;
            }
            decimal = decimal + digit * power;
            power *= 16;

        }
        System.out.println(decimal);
    }
}
