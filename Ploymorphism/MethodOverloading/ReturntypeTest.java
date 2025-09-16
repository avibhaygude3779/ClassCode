package Ploymorphism.MethodOverloading;

public class ReturntypeTest {

    public static void main(String[] args)
    {
        ReturntypeTest obj = new ReturntypeTest();
        int sum = obj.m1(20, 30);
        System.out.println(sum);
        int multiply = obj.m1(20,30);
        System.out.println(multiply);
    }



        public int m1(int a, int b) // Duplicate method error.
        {
            int x = a + b;
            return x;
        }
        public double m1(int c, double d) // Duplicate method error if we assign same method signature.
        {
            double y = c * d;
            return y;
        }
    }
