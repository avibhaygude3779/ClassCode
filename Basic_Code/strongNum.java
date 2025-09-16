package Basic_Code;

import java.util.Scanner;

public class strongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number");
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;

        while(n!=0) {
            int digit = n%10;
            int fact =  1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;

            }
            sum+=fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(temp+" is Strong number");
        }else{
            System.out.println("Not a strong num");
        }

    }
}

