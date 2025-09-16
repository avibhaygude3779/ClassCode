package collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {

        Queue <Integer> que = new LinkedList<>();
        System.out.println(que.peek());// return null because queue is empty

        que.offer(100);
        que.offer(600);
        que.offer(500);
        que.offer(300);
        que.offer(200);
        que.offer(400);

        System.out.println(que);
        // poll() return head and remove it
        System.out.println(que.poll());
        System.out.println(que);
        // peek() return head of queue
        System.out.println(que.peek());
        System.out.println(que);





    }
}
