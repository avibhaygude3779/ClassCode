package ExceptionHandling.UncheckedException;

public class ArithmaticException {
    public static void main(String[] args) {
        int a=1;
        int b = 0;
        try {
            int c = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Can't be divided by zero");
        }
    }
}
