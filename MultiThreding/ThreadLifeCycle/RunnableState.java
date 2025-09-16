package MultiThreding.ThreadLifeCycle;

public class RunnableState extends Thread {
    public static void main(String[] args) {
        // Create a new thread. This thread is in NEW state.
        RunnableState thread = new RunnableState();
        //Thread th = new Thread(thread);

        // Check thread state (NEW)
        System.out.println("Thread state before start: " + thread.getState());

        // Start the thread. Now the thread moves from New to Runnable state.
        thread.start();

        // Check the current thread state after calling start.
        System.out.println("Thread state after start: " + thread.getState());

    }
}
