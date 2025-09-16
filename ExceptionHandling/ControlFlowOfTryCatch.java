package ExceptionHandling;
// in this example here exception is not occured so the statement present inside the catch block are not excuted
// if try block have exception then only it will goes inside the catch block.
public class ControlFlowOfTryCatch {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            int a=100,b=2,c;
            c=a/b;
            System.out.println(3);
        }
        catch (Exception e){
            System.out.println(4);
            System.out.println(e);
        }
        System.out.println(5);
    }
}
