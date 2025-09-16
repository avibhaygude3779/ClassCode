package ExceptionHandling;

public class returnInFinallyBlock {
            int m1()
            {
                try {
                    System.out.println("I am in try block");
                    int x = 10/0;
                    System.out.println("Result: " +x);
                }
                catch(ArithmeticException ae)
                {
                    System.out.println("I am in catch block");
                    return 40;
                }
                finally {
                    System.out.println("I am in finally block");
                    return 50;
                }
            }
            public static void main(String[] args)
            {
                returnInFinallyBlock obj = new returnInFinallyBlock();
                System.out.println(obj.m1());
            }
    }
//In the above example program, finally block overrides the value returned by catch block. Therefore, the returned value is 50.
/*
package finallyProgram;
public class FinallyReturn3 {
    @SuppressWarnings("finally")
    int m1()
    {
        int a = 20, b = 0;
        try {
            System.out.println("I am in try block");
            int c = a/b;
            System.out.println("Result: " +c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("I am in catch block");
            return 40;
        }
        finally {
            System.out.println("I am in finally block");
            return 50;
        }
        System.out.println("Statement after finally block");
    }
    public static void main(String[] args)
    {
        FinallyReturn3 obj = new FinallyReturn3();
        System.out.println(obj.m1());
    }
}
Java disallows any statement after a return in finally, as it's guaranteed that return will exit the method — so code after that is unreachable.
*/