package Arraycode;
import java.util.*;
public class FindArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a arr size");
        int n=sc.nextInt();
        int []arr = new int[n];
        int nextNum=0 ;
        int[] result=new int[n];

        System.out.println("enter a arr number");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int sum=0;
            while(temp!=0) {

                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }
            if(arr[i]==sum){
                result[nextNum]=arr[i];
                nextNum++;
            }
        }

        if (nextNum == 0) {
            System.out.println("No Armstrong numbers found in the array.");
        } else {
            System.out.print("In the array, Armstrong numbers are: ");
            for (int i = 0; i < nextNum; i++) {
                System.out.print(result[i] + " ");
            }
        }


    }
}
