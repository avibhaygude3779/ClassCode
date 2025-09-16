package Arraycode;

public class CharArray {

    public static void main(String[] args) {
        char[] arr = {'a','@','c','$','d','*'};

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= 'a') {
                System.out.println(arr[i]);
            }

        }
    }
}

