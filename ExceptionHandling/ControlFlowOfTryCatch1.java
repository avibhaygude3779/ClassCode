package ExceptionHandling;
/* here in try block there are multiple statement buf in the exception line means when exception occur
 after that it will directy move in catch block the ststement present below that exception line in try block are
 not executed */
public class ControlFlowOfTryCatch1 {
    public static void main(String[] args) {

      System.out.println(1);
        try {
        System.out.println(2);
        int a=100,b=0,c;
        c=a/b;
        System.out.println(3);
    }
        catch (Exception e){
        System.out.println(4);
        System.out.println(e);
    }
        System.out.println(5);
}}