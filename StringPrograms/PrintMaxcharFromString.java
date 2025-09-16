package StringPrograms;

import java.util.Scanner;
public class PrintMaxcharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        char max = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>max){
                max=str.charAt(i);
            }
        }
        System.out.println("the maximum char in a string is :  "+max);
    }
}
