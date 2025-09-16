package MultiThreding.ThreadLifeCycle;

public class NewState extends Thread {
    public static void main(String[] args) {
        // Create a new thread. This thread is in NEW state.
        NewState thread = new NewState();
        Thread th = new Thread(thread);

        // Check thread state (NEW)
        System.out.println("Thread state before start: " + thread.getState());
    }
}
