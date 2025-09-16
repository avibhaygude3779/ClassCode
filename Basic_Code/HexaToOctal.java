package Basic_Code;
import java.util.*;
public class HexaToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal");
        String hex = sc.nextLine();
        System.out.println("Firstly convert the string into binary");
        int decimal = Integer.parseInt(hex,16);
        System.out.println("Binary num is: "+decimal);
        System.out.println("Convert binary to octal");
        String octal = Integer.toOctalString(decimal);
        System.out.println("The octal num is: "+octal);
    }
}
