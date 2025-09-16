package Basic_Code;

public class findnumdivByNine {
    public static void main(String[] args) {
        int count = 0 ;
        int sum = 0;
        for(int i=100;i<=200;i++){
            if(i%9==0){
                sum+=i;
                count++;
                System.out.println("Number divisible nine are : "+i);
            }

        }
        System.out.println("Number divisible nine count between 100 and 200: "+count);

        System.out.println("number divisible nine sum between 100 and 200 :"+sum);
    }
}
