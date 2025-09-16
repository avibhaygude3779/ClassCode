package Basic_Code;
import java.util.*;
public class displayCountPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int postiveCount = 0;
        int negativecount = 0;
        int zeroCount = 0;
        char choice;
        do {
            System.out.println("Enter a  number ");
            int num=sc.nextInt();

            if(num>0){
                postiveCount++;
            }
            else if(num<0){
                negativecount++;
            }else{
                zeroCount++;
            }
            System.out.println("Do you want to enter a another element ");
            choice = sc.next().charAt(0);

        }while(choice =='y'|| choice =='Y' );

        System.out.println("Positive number count is: "+ postiveCount);
        System.out.println("Negative number count is: "+ negativecount);
        System.out.println("Zero count: "+ zeroCount);
    }
}