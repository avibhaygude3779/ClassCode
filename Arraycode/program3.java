package Arraycode;
import java.util.*;

public class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a array size");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter a array element ");
        for(int i=0 ;i<arr.length ; i++){
            arr[i] = sc.nextInt();}

        System.out.println("Print element");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }

    }
}
