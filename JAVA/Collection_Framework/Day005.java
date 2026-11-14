import java.util.LinkedList;
import java.util.Queue;

public class Day005 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.poll();
        System.out.println(queue);
    }
}
