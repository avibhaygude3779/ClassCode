package ExceptionHandling;

public class FinallyBlock2 {
    public static void main(String[] args) {
                try
                {
                    System.out.println("111");
                    System.out.println(20/0);
                    System.out.println("222");
                }
                catch(NullPointerException npe)
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

/*In the preceding example program, exceptions have occurred in try as well as finally block but the thrown exception
object is not matching with catch block.So, the program will be terminated abnormally but before the termination of program,
JVM will go to execute finally block.*/