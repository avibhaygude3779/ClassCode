package Arraycode;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        // Copy first array into merged array
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        // Copy second array into merged array
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        // Print merged array
        System.out.print("Merged Array: ");
        for (int i=0 ; i<merged.length;i++) {
            System.out.print(merged[i]+" ");
        }
    }
}
