package ExceptionHandling;

public class UncheckedException {
 public static void main(String[] args) {
//                int x = 10;
//                int y = 0;
//                int z = x/y; // runtime exception occurs.
//                System.out.println(z);
//            }
//        }
//
// above program will throw the unchecked exception

     // Apply try-catch block to handle runtime exception.
            int x = 10;
            int y = 0;
            try {
                int z = x/y; // runtime exception.
                System.out.println(z);
            } catch(ArithmeticException ae)
            {
                System.out.println("A number cannot be divided by zero");
            }
        }
    }

