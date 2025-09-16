package Pattern;
public class pattern_11 {
    public static void main(String[] args){
        int count=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                if(j%2==0){
                    System.out.print(count*count+" ");
                }else{
                    System.out.print(count+" ");
                }
                count++;
            }System.out.println();
        }
    }
    
}
