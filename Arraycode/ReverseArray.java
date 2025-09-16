package Arraycode;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter a array element : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed Array : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(" ["+ arr[i]+"]");
        }



    }
}
