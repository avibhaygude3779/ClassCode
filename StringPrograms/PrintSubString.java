package StringPrograms;
import java.util.*;
public class PrintSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            String temp="";
            for(int j=i;j<ch.length;j++){
                temp+=ch[j];
                System.out.println(temp);
            }

        }

    }
}
