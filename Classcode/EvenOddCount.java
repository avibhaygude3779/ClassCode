package Classcode;
import java.util.*;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array size");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter a array element");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int EvenSum = 0;
        int OddSum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                EvenSum+=arr[i];
            }
            else{
               OddSum+=arr[i];
            }
        }
        System.out.println("Even index sum : "+EvenSum);
        System.out.println("Odd index sum : "+OddSum);
    }
}
