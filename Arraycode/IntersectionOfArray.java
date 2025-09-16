package Arraycode;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        int[]arr2 = {10,20,60,70,50,10};

        for(int i=0 ; i<arr.length ; i++){

            for(int j=0;j<arr2.length ; j++){
                if(arr[i]==arr2[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
