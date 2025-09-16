package StringPrograms;
import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        //String temp = str;
        String rev = "";
        char ch[]=str.toCharArray();//convert string to char array

        for(int i=str.length()-1;i>=0;i--){
             rev = rev + ch[i];
        }
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }



    }
}
