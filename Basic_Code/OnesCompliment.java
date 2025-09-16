package Basic_Code;

import java.util.Scanner;

public class OnesCompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        String num = sc.nextLine();
        String ans="";
        for(int i=0;i<num.length();i++){
            int bit = num.charAt(i);
            if(bit== '0'){
                ans = ans +  '1';
            }else if(bit=='1'){
                ans=ans +'0';
            }else{
                System.out.println("Invalid input");
            }
        }
        System.out.println("One's compliment of "+ num + " is " +ans);
    }
}
