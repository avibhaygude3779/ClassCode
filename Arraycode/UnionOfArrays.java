package Arraycode;

public class UnionOfArrays extends Thread{
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4};
        int[] arr2 = {5,1,7};

        int n1=arr1.length;
        int n2=arr2.length;

        int[] temp = new int[n1+n2];
        int k=0;
        for (int i=0;i<n1;i++){
            temp[k++] = arr1[i];
        }
        for(int i =0;i<n2 ;i++){
            boolean isduplicate = false;
            for(int j=0 ;j<arr1.length;j++ ){
                if(arr2[i]==temp[j]){
                    isduplicate=true;
                    break;
                }
            }
            if(!isduplicate) {
                    temp[k++]=arr2[i];
            }

        }
        System.out.println("print union of two array");
        for(int i=0 ; i< k;i++){
            System.out.print(temp[i]);
        }
    }
}
