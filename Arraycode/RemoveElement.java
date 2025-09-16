package Arraycode;
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a Size of a array");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter a Array");
        for(int i=0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter element for remove");
        int remove=sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=remove){
                count++;
            }
        }

        int[] outputArray = new int[count];
        int j=0;
        for(int i=0 ;i< arr.length;i++){
            if(arr[i]==remove){
                continue;
            }
            else {
               outputArray[j]=arr[i];
               j++;
            }

        }
        for(int i=0 ;i< outputArray.length;i++){

            System.out.print(" " +outputArray[i]);
        }



    }
}
