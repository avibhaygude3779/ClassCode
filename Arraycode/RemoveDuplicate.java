package Arraycode;
import java.util.*;

public class RemoveDuplicate {

    public static int removeduplicate(int nums[]){

        Arrays.sort(nums);

        int n=nums.length;
        int k=1;

        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){

                nums[k]=nums[i];
                k++;

            }
        }
        return k;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enetr a array size");
//        int n = sc.nextInt();
//
//        int []arr = new int[n];
//        System.out.println("Enter a array");
//        for(int i=0 ; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int newSize=0;
//        int[] temp = new int[n];
//
//        for(int i=0 ;i<arr.length;i++){
//            boolean isduplicate = false;
//
//            for(int j=0;j<newSize;j++){
//                if(arr[i] == temp[j]){
//                    isduplicate=true;
//                    break;
//                }
//            }
//            if(!isduplicate){
//                temp[newSize]=arr[i];
//                newSize++;
//            }
//        }

        int nums[]={1,2,3,4,3,2,4,56,7,8};

        int ans = removeduplicate(nums);
        System.out.println(" result ");
        for(int i=0 ; i<ans  ;i++){
            System.out.println(nums[i]);
        }



    }
}
