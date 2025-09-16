package ExceptionHandling.CheckedException;

public class InterptedException {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        Thread.sleep(1000);  // throw interrupted exception
    }
}
