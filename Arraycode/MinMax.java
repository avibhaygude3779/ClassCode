package Arraycode;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a array size");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter a array element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Assume first element in array is min and max
        int max = arr[0];
        int min= arr[0];

        System.out.println("Print element");

        for(int i=0 ;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximun number in array "+max);
        System.out.print("Manimun number in array "+min);
    }
}
