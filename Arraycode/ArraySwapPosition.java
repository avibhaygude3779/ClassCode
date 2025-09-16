package Arraycode;

public class ArraySwapPosition {

    public static void main(String[] args) {
        int[] arr = {60, 30};
        int temp = 0;

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("Swap the elements in given array ");


        for (int i = 0; i < arr.length; i++){
            System.out.println("Element in array are "+arr[i]);
        }
    }
}
