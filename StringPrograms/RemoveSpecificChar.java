package StringPrograms;
import java.util.*;
public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println("Enter a index of char to remove");
        char remove = sc.next().charAt(0);
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                result+=str.charAt(i);
            }

        }
        System.out.println("after removing specific char the String is : "+result);

    }
}
