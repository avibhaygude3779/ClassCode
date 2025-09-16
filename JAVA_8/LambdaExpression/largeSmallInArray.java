package JAVA_8.LambdaExpression;
//19. Find 2nd largest/smallest in array using lambda
//Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.

interface arrayOperation{
    int  Operation(int[] arr);
}
public class largeSmallInArray {
    public static void main(String[] args) {
        int[] arr = {25,45,75,8,44,12,63,95,78,95,12,1};
        arrayOperation opMax = (a)->{
            int max = arr[0];
            for(int i=0;i<arr.length;i++){

              if(arr[i]>max){
                  max=arr[i];
              }
          }
          return max;
        };
        arrayOperation opMin = (a)->{
            int min = arr[0];
            for(int i=0;i<arr.length;i++){

                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        };
        System.out.println("Largest element in array: "+opMax.Operation(arr));
        System.out.println("Smallest element in array: "+opMin.Operation(arr));
    }
}
