package Arraycode;

public class SecondLargestNum {

    static int secondLarge(int[] arr){
        int max=arr[0];
        int second_Max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                second_Max=max;
                max=arr[i];
            } else if (second_Max<arr[i] && arr[i]!=max) {
                second_Max=arr[i];
            }
        }
            if(second_Max==0){
                System.out.println("no second largest element");
                return -1;

        }

        return second_Max;

    }

    public static void main(String[] args) {
        int[] arr={8,8,5,9,4};
        System.out.println(secondLarge(arr));
    }
}
