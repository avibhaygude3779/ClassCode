package Arraycode;

public class SecondLargest2 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int temp;

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
              }
           }
        }
        int max=arr[arr.length-1];
        boolean found = false;
        for(int i= arr.length-2 ; i>=0 ; i--) {
            if (arr[i] != max) {
                System.out.println("second_largest :" + arr[i]);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No second largest element");
        }
    }

}


