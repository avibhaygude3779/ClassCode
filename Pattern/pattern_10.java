package Pattern;
public class pattern_10 {
    public static void main(String[] args){
        // int count=1;
        // char ch='A';

        for(int i=1 ; i<=4 ; i++){
            int count=1;
            char ch='A';
            for(int j=1 ; j<=4-i+1 ;j++){
                if(j%2==0){
                    System.out.print(count++);
                }else{
                    System.out.print(ch++);
                }
            }System.out.println();

        }
    }
    
}
