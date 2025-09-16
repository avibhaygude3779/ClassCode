package collection.Queue;

import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(30);
        pq.add(20);
        pq.add(101);
        pq.add(10);

        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

//        PriorityQueue pq2 = new PriorityQueue();
//        pq2.add("java");
//        pq2.add("python");
//        pq2.add("cpp");
//        pq2.add("c");
//        pq2.add("ze");
//       // System.out.println(pq2.add(2));
        //System.out.println(pq2.peek());



    }
}
