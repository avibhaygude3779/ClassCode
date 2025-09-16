package Ploymorphism.MethodOverloading;

public class Program1 {

        // Method to calculate the sum of two numbers.
// Declare an instance method named sum with two parameters a and b of data type int.
        void sum(int a, int b)
        {
            int s = a + b;
            System.out.println("Sum of two numbers: " +s);
        }
        // Method to calculate sum of three numbers.
// Declare an instance method named sum with three parameters a, b, and c of data type int.
// Here, the method sum() is overloaded with the same method name and different parameter lists.
        void sum(int a, int b, int c)
        {
            int t = a + b + c;
            System.out.println("Sum of three numbers: " +t);
        }
        public static void main(String[] args)
        {
            Program1 a = new Program1();
            a.sum(10, 20); // This will call sum() method to calculate sum of two arguments.
            a.sum(50, 100, 200); // This will call sum() method to calculate sum of three arguments.
        }
    }

