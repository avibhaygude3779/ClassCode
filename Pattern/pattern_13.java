package Pattern;
class pattern_13 {
    public static void main(String[] args){

        int n=4;
        for(int i=1 ; i<=n ; i--){
            for(int j=1 ;j<n ; j++){
                System.out.print(" ");
            }
            for(int k = n-i ; k<=n; k++){
                System.out.print(" * ");
            }
           System.out.println();
        }
    }
    
}
