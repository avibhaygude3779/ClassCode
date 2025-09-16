package ExceptionHandling;
public class DeafaultExcaption_1 {
       public static void main(String[] args)
        {
            try {
            m1(); // main() method calling m1().
        } catch (Exception e) {
                System.out.println("Cant divide by zero");
            }
        }
        public static void m1()
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("hello"); //unreachable statement
        }

    }

