package Arraycode;
// Print even number and odd number in a array separetly
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a array size");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter a array element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Print element");
        int sumEven=0;
        int sumOdd = 0;
        for(int i=0 ; i<arr.length ; i++) {

            if(arr[i]%2==0){
            sumEven = sumEven+arr[i];
            System.out.println("Even Number"+arr[i]+" ");

           } else{
                sumOdd = sumOdd+arr[i];
                System.out.println("odd number:"+arr[i]+" ");


            }

        }
        System.out.println("even sum: "+sumEven + " odd sum:  "+sumOdd);
    }
}
