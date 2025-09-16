package MultiThreding;

class Mythread1 extends Thread{
   public void run() {

       for (int i = 1; i <= 5; i++) {
           System.out.println("In Run thread :"+i);
           try{
             Thread.sleep(500);
           }catch (InterruptedException e){

           }
       }

   }
}

public class SleepMethod {
    public static void main(String[] args)throws InterruptedException
    {
        Mythread1 obj = new Mythread1();
        obj.start();
        for(int i=1;i<=5;i++){
            System.out.println("In main Thread :"+i);
            Thread.sleep(500);
        }
        System.out.println(Thread.activeCount());

    }
}
