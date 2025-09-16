package Basic_Code;

import java.util.Scanner;

public class decimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        String hexa ="";
        int rem;
        for(;decimal>0;decimal=decimal/16){
            rem=decimal%16;

            if(rem<10){
                hexa = rem+hexa; //storing 0 to 9 element in string
            } else if (rem>9) {
                hexa=(char) (rem-10+'A')+ hexa;
            }


        }
        System.out.println(hexa);
    }

}
