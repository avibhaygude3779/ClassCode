package ExceptionHandling;

 public class RethrowingException {
     void m1() {
         try {
             // Taking a string with 9 chars. Their index will be from 0 to 8.
             String str = "Scientech";
             char ch = str.charAt(10); // Exception is thrown because there is no index with value 10.
         } catch (StringIndexOutOfBoundsException se) {
             System.out.println("String index out of range");
             throw se; // Rethrow the same exception.

         }
       }
     }
      class B {
         public static void main(String[] args) {
             // Create an object to class A and call m1() method.
             RethrowingException a = new RethrowingException();
             try {
                 a.m1();
             }
             // Rethrown exception is caught by below catch block.
             catch (StringIndexOutOfBoundsException se) {
                 System.out.println("Rethrow exception is caught here: " + se);
             }
         }
     }
 /*In this program, there are two classes A and B. StringIndexOutOfBoundsException is thrown in m1()
 method of class A that is caught and handled by catch block in that method.
 Now, we want to propagate exception details to another class B. For this,
 catch block of class A is rethrowing it into the main method of class B where it can be handled.
 Hence, we can rethrow an exception from catch block to another class where it can be handled.*/

