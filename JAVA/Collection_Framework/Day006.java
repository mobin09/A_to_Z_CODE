import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Day006 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); 
        // Insertion
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

       System.out.println("Queue: "+ queue); // [10, 20, 30, 40]
       // retrieving front element without removing
       System.out.println("Front:" + queue.peek()); // 10
       // remove front element
       System.out.println("Removed:: " + queue.poll()); //10

       System.out.println("After removal:: "+ queue); // [20, 30, 40]

       System.out.println("\n");

       Queue<String> queue2 = new ArrayDeque<>();
       queue2.offer("Java");
       queue2.offer("Spring Boot");
       queue2.offer("Microservices");
       queue2.offer("Kafka");

       System.out.println(queue2);// [Java, Spring Boot, Microservices, Kafka]

       System.out.println("Processing:: " + queue2.poll()); // Java

       System.out.println(queue2); // [Spring Boot, Microservices, Kafka]

      
       System.out.println("\n");

       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.offer(40);
       pq.offer(10);
       pq.offer(30);
       pq.offer(20);
    }
}