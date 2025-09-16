package Basic_Code;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int decimal = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        while (decimal!=0){
            int rem = decimal%2;
            binary.insert(0,rem);
            decimal = decimal/2;
        }
        System.out.println(binary);
    }
}
