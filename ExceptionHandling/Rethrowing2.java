package ExceptionHandling;

public class Rethrowing2 {
        public static void main(String[] args)
        {
            try {
                m1();
            }
            catch(ArithmeticException ae)
            {
                System.out.println("An exception of another type is recaught: \n" +ae);
            }
        }
        static void m1() {
            try {
                int a[] = {1, 2, 3, 4, 5};
                System.out.println(a[5]); // Exception is thrown because there is no index with value 5.
            }
            catch(ArrayIndexOutOfBoundsException aie)
            {
                System.out.println("Array index out of range: \n" +aie);
                throw new ArithmeticException(); // Rethrow another type exception.
            }
        }
    }
//In this example program, catch block catches ArrayIndexOutOfBoundsException, and rethrow another type ArithmeticException.
