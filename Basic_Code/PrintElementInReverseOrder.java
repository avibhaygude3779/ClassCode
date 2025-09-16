package Basic_Code;

public class PrintElementInReverseOrder {

    public static void main(String[] args) {
        int[] array =  {10,20,30,40,50,60,70,80};
        for(int i = array.length - 1 ; i >= 0; i--){
            System.out.println("Element present at index " + i + "  is "+array[i]);
        }

        for(int i = 0; i < array.length; i++){
            System.out.println("Element present at index " + i + "  is "+array[i]);
        }

    }
}
