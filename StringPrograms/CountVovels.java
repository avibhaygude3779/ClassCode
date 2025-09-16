package StringPrograms;
import java.util.*;
public class CountVovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int count = 0;

        for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o' ||ch =='u'||
              ch=='A'||ch=='E'||ch=='I'||ch=='O'||str.charAt(i)=='U') {
                count++;

            }
        }
        System.out.println("Number of vovels present in String is : "+ count);

    }
}
