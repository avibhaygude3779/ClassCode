package ExceptionHandling;

public class FinallyBlock1 {
    public static void main(String[] args) {
        try
        {
            System.out.println("111");
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("333");
        }
        finally
        {
            System.out.println(10/0); // Exception occurred in finally block.
        }
        System.out.println("555");
    }
}


/*In this example program, an arithmetic exception has occurred inside try block. Since the thrown exception object is matched
with the corresponding catch block, therefore, the control will immediately go to catch block to handle the exception.
After execution of catch block, JVM will go to execute finally block but inside finally block, an exception occurred.
So, JVM will terminate the program abnormally.*/
