package Basic_Code;

import java.util.Scanner;

public class parfectNum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
               int sum=0;

        for(int i=1;i<6;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("Number is perfect");
        }else{
            System.out.println("Number is not perfect");
        }
    }
}
