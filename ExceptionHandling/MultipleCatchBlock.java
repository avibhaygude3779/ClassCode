package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleCatchBlock {
    public static void main(String[] args)throws IOException {
                int x, y;
// Creating a scanner class object to take the input from the user.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// Applying try-catch block.
                try
                {
                    System.out.println("Enter your first number");
                    x = Integer.parseInt(br.readLine());
                    System.out.println("Enter your second number");
                    y = Integer.parseInt(br.readLine());

                    int z = x / y;
                    System.out.println("z = " +z);
                }
                catch(ArithmeticException ae)
                {
                    System.out.println("A number cannot be divided by 0, Illegal operation in Java");
                    System.out.println("Exception thrown: " +ae);
                }
                catch(NumberFormatException nfe)
                {
                    System.out.println("Invalid data types are entered, number must be an integer.");
                    System.out.println("Exception thrown: " +nfe);
                }
                catch(RuntimeException re)
                {
                    System.out.println("Exception thrown: " +re);
                }
                System.out.println("Out of try-catch block");
            }

}
