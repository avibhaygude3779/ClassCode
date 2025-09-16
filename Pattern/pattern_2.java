package Pattern;
public class pattern_2 {

    public static void main(String[] args){
        int row=3;
        for(int i=1 ; i<=row ; i++){
            char ch = 'A';
            for(int j=1 ; j<=row ; j++){

                System.out.print(ch++);
            }
            System.out.println();
        }

    }
    
}
