package Arraycode;
import java.util.*;
public class CheckFrequncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean[] visited =new boolean[n];

        System.out.println("enter a array size");
        for(int i=0 ; i<arr.length ;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter a frequncy of number");

        for(int i=0 ; i< arr.length ; i++){

            if(visited[i]) {
                continue;
            }
            int count = 1;
            for(int j=i+1 ;j<arr.length ;j++){

                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }


                System.out.println("frequncy of "+arr[i]+" is "+count);

        }

    }
}
