package StringPrograms;
import java.util.*;
public class RevWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char temp ;
        for(int i=0;i<str.length();i++){
            if(ch[i]!=' '){
                temp=ch[i];
            }
        }
    }
}
