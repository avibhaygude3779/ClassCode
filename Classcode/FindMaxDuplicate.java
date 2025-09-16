package Classcode;
import java.util.*;
public class FindMaxDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


 //       int max = arr[0];
        int[] temp = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[i]=arr[j];
                    System.out.println("Duplicate Element: "+temp[i]);
                }
            }
        }


        int max=temp[0];
        for(int i=0;i< temp.length;i++){
            if(max<temp[i]){
                max = temp[i];

            }
        }
        System.out.println("Maximum duplicate in given array is: "+max);

    }
}
