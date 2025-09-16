package StringPrograms;
import java.util.*;
public class CheckSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println("Enter a SubString");
        String substr = sc.nextLine();
        boolean isSubstr = false;
        for(int i=0;i<str.length()-substr.length();i++){
            int j;
            for(j=0;j< substr.length();j++){
                if(str.charAt(j+i)!=substr.charAt(j)){

                    break;
                }
            }
            if(j==substr.length()){
                isSubstr=true;
                break;
            }
        }


        if(isSubstr){
            System.out.println("the String "+substr+" is SubString of "+str);
        }
        else {
            System.out.println("not substring");
        }
    }
}
