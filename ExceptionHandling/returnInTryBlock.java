package ExceptionHandling;

public class returnInTryBlock {
    int m1()
    {
        try {
            System.out.println("I am in try block");
            return 50;
        } catch (Exception e) {
            System.out.println("I am in catch block");
        }
        return 20; // return statement at the end of a method.
     //  System.out.println("Statement after return");

       /* Unreachable code.This is because any statement after
          return statement will result in compile-time error stating “Unreachable code”.*/

    }

        public static void main (String[]args)
        {
            returnInTryBlock ft = new returnInTryBlock();
            System.out.println(ft.m1());
        }
    }
