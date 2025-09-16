package Pattern;
public class pattern_3 {

    public static void main(String[] args){
        // char ch='A';
        // int count = 1;
        for(int i=1 ; i<=3 ; i++){
             char ch='A';
             int count = 1;
            for(int j=1 ; j<=4 ;j++){
               // char ch='A';
                //int count = 1;
               
                if(j%2 ==0){
                    System.out.print(count++);
                }
                else{
                    System.out.print(ch++);
                }

            }System.out.println();
        }
    }
    
}
