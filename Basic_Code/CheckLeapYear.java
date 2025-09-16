package Basic_Code;
import java.util.*;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("The "+ year +" year is leap year");
        }else{
            System.out.println("The "+ year +" year is not leap year");
        }
    }
}

