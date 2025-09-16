package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
                int a = 20, b = 0;
                try
                {
                    System.out.println("Value of a: " +a);
                    System.out.println("Value of b: " +b);
                    int div = a/b;
                    System.out.println("Division: " +div);
                }
                catch(NullPointerException npe)
                {
                    System.out.println(npe); // prints corresponding exception.
                }

                finally
                {
                    System.out.println("Denominator cannot be zero");
                }
                System.out.println("Hello Java");

            }
        }


/* In the above code, an arithmetic exception has occurred inside try but it has been not handled by
 catch block because the corresponding catch block is not matched with exception object.
Therefore, JVM will hand over exception object to the default exception handler for abnormal termination of the program.
But before handing over to the default exception handler, JVM will execute finally block. After the execution of finally block,
JVM will not execute any given statements after finally block. */

