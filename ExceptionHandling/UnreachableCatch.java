package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnreachableCatch {
    public static void main(String[] args) throws IOException {
                String str = "Scientech Easy";
                int x[ ] = {0, 1, 2, 3, 4};

                try // Outer try block
                {
                    int slength = str.length();
                    System.out.println("String length: " +slength);

                    try // Inner try block
                    {
                        int y = 6;
                        System.out.println(x[y]); // Exception occurred.
                    }
                    catch(ArithmeticException ae) // No match is found.
                    {
                        System.out.println("Exception is thrown");
                        System.out.println(ae.toString());
                    }
                }
                catch(ArrayIndexOutOfBoundsException aie) // Match found.
                {
                    System.out.println("Exception is thrown ");
                    System.out.println(aie.toString());
                }
                System.out.println("I am out of outer catch block");


        System.out.println("--------------------------------------");

                String str1 = "Scientech Easy";
                int y[ ] = {0, 1, 2, 3, 4};

                 // Outer try block.
                try
                {
                    int length = str.length();
                    System.out.println("String length: " +length);
                    // An inner try catch block inside a try block.
                    try
                    {
                        int m = 6;
                        System.out.println(y[m]); // Exception occurred.
                    }
                    catch(ArithmeticException ae) // No match is found.
                    {
                        System.out.println("Exception is thrown");
                        System.out.println(ae.toString());
                    }
                }
                catch(NullPointerException npe) // No match is found.
                {
                    System.out.println("Exception is thrown ");
                    System.out.println(npe.toString());
                }
                System.out.println("I am out of outer catch block");
            }
        }
