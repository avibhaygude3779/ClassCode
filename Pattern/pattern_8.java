package Pattern;
public class pattern_8 {
    public static void main(String[] args){

        int n = 4;
        int count = 1;
       // int num = 3;

        for(int i=1 ; i<=n ; i++){
            for(int j=1; j<=i;j++){

                // System.out.print(count);
                // count+=num;
                // num+=2;
                System.out.print(count*count);
                count++;
            }System.out.println();
        }
    }
    
}
