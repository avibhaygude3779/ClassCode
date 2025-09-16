package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class youngerAgeException extends RuntimeException {
   youngerAgeException(String msg){
       super(msg);
   }
}
class voting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the age of voter : ");
        int age = Integer.parseInt(br.readLine());
        try {
            if (age < 18)
            {
                throw new youngerAgeException(" Age is not valid : ");
                //System.out.println("fgshfsdhgf");           // error unreachable errror
            } else
            {
                System.out.println("Voting Successfully : ");
            }
        }
        catch (youngerAgeException e){
            e.printStackTrace();
        }
        System.out.println(" Hello");

    }
}
