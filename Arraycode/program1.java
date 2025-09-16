package Arraycode;

public class program1 {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[1]=10;
        array[2]=20;
        array[3]=30;
        array[4]=40;
        array[0]=50;



// enhanced for loop
//        for (int j : array) {
//            System.out.println(j);
//        }
        for(int i=0 ;i< array.length;i++){
            System.out.println(array[i]);
        }

    }

}
