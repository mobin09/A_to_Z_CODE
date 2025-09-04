import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Day11 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);
        System.out.println(queue.poll()); // 10
        System.out.println(queue.peek()); // 20
        System.out.println(queue);

       System.out.println("Priority Queue");
       
       Queue<Integer> pq = new PriorityQueue<>();
       pq.offer(50);
       pq.offer(10);
       pq.offer(30);

       while (!pq.isEmpty()) {
           System.out.println(pq.poll() + " "); // 10 30 50
       }

    }
}

