package StringPrograms;
import java.util.*;
public class SearchString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strings");

        //String[] str = {"java","cpp","python","javascript","html"};
        String[] str = new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }

        System.out.println("Enter a string which want to search");
        String searching_Str = sc.next();
        boolean isStringFound=false;
        for(int i=0;i<str.length;i++){

            if(str[i].equals(searching_Str)){
                System.out.println("index of given string: "+ i);
                isStringFound=true;
                break;
            }
        }
        if(!isStringFound){
            System.out.println("String is not found");
        }

    }
}
