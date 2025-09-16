package Loop_Code;

public class program9 {

        public static void main(String[] args) {

            int number = 100;
            int sum = 0;

            for(int i=1 ; i<=number ;i++){

                if(i%2==0){
                    sum = sum+i;

                }
            }
            System.out.println("Sum of all even number is "+sum);
        }
}
