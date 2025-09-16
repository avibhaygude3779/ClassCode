package MultiThreding;

public class MainThread {
    public static void main(String[] args)

    {
        // Create a Thread object by calling currentThread() method of class Thread.
        Thread obj = Thread.currentThread();

        System.out.println("Current thread is " +obj); // line 7
        System.out.println("Name of current thread is " +obj.getName());
    }
}
