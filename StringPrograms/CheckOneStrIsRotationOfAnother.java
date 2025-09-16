package StringPrograms;
import java.util.*;
public class CheckOneStrIsRotationOfAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=sc.nextLine();

        System.out.println("Enter a another string to check rotation");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not the same length, so rotation is not possible.");
            return;
        }

        // Create str1 + str1 manually
        int len = str1.length();
        char[] combined = new char[2 * len];

        for (int i = 0; i < len; i++) {
            combined[i] = str1.charAt(i);
            combined[i + len] = str1.charAt(i);
        }

        // Manually check if str2 is a substring of combined
        boolean isRotation = false;

        for (int i = 0; i <= combined.length - len; i++) {
            int j = 0;
            while (j < len && combined[i + j] == str2.charAt(j)) {
                j++;
            }
            if (j == len) {
                isRotation = true;
                break;
            }
        }
        if(isRotation){
            System.out.println("the string "+str2 +" is rotaion of  string "+ str1);
        }
        else{
            System.out.println("the string "+ str2 +" is not rotaion of  string "+ str1);
        }

    }
}
