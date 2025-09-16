package Pattern;
public class pattern_9 {

    public static void main(String[] args){

        int n=4;
        int count = 1;
        for(int i=1; i<=n ; i++){
            for(int j=1;j<=i ; j++){
                if(count%2==0){
                System.out.print(count*count);
            }
            else{
                System.out.print(count);
            }
            count++;
        }System.out.println();
        }

    }
    
}
