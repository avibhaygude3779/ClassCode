package JAVA_8.LambdaExpression;



public class createThread {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for(int i=1;i<10;i++){
                System.out.println("Hello-"+i);
            }
        };
        runnable.run();
    }
}
