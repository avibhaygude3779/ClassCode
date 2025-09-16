package Loop_Code;
//8. Write a program to print all odd number between 1 to 100
public class program8 {

        public static void main(String[] args) {

            int number = 100;

            for(int i=1 ; i<=number ;i++){

                if(i%2!=0){
                    System.out.println(i+" is odd number");
                }
            }
        }
}
