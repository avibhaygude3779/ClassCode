package Arraycode;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter a array size");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter a array element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Print element");

        for(int i=0 ;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of array "+ sum);

    }
}
