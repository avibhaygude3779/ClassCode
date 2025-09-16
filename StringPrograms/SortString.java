package StringPrograms;
import java.util.*;
public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();

        char[] ch = str.toCharArray();

        char temp=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                //char temp=' ' ;
                if(ch[i]>ch[j]){
                    temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
