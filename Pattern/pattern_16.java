package Pattern;

public class pattern_16 {
    public static void main(String[] args) {
        int row=5;

        for(int i=0 ; i<row ;i++){
            // for space printing
            for(int j=i ; j<row ; j++){
                System.out.print(" ");
            }
            // for star printing
            for(int k= 0; k<2*i-1 ;k++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
