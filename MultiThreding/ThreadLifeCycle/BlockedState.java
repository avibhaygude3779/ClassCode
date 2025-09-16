package MultiThreding.ThreadLifeCycle;

public class BlockedState extends Thread {

    private Object lock;

    public BlockedState(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is trying to acquire the lock.");

        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
            try {
                // Hold the lock for 2 seconds.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is releasing the lock.");
        }

    }

    public static void main(String[] args) {
        Object lock = new Object();

        // Create two threads that will try to acquire the same lock.
        BlockedState thread1 = new BlockedState("Thread 1", lock);
        BlockedState thread2 = new BlockedState("Thread 2", lock);

        // Start both threads using start() method.
        thread1.start();
        thread2.start();
    }
}


