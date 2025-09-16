package StringPrograms;

import java.util.Scanner;
import java.util.*;
public class ReverseString {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a strings");
            String Str = sc.next();
            String rev="";

//            for(int i=Str.length()-1;i>=0;i--){
//                rev = rev + Str.charAt(i);
//            }

            for(int i=0 ; i<Str.length();i++){
                char ch = Str.charAt(i);
                rev = ch + rev;
            }
            System.out.println("Reversed: " + rev);
        }
}
