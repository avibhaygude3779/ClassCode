package Basic_Code;


import java.util.Scanner;

public class displayLargestSmallest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            char choice;

            do {
                System.out.println("Enter a  number ");
                int num = sc.nextInt();
                if(num>max){
                    max = num;
                }
                if(min>num){
                    min=num;
                }
                System.out.println("Do you want to enter a another element ");
                choice = sc.next().charAt(0);

            }while(choice =='y'|| choice =='Y' );



            System.out.println("largest number  is: "+ max);
            System.out.println("smallest number is: "+ min);

        }
}
