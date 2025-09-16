package MultiThreding;

class Mythread extends Thread{

    public void run(){
        for(int i=1 ; i<=5 ; i++){
            System.out.print(i);
        }
    }

}
public class CreateThread {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        obj.start();
        char ch = 'a';
        for(int i =0;i<=4 ;i++){
            System.out.print(ch++);
        }

    }
}
