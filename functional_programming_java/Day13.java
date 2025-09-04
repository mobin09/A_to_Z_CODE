import java.util.ArrayDeque;
import java.util.Deque;

public class Day13 {
    public static void main(String[] args) {
        Deque<Integer> deque  = new ArrayDeque<>();
        deque.add(7);
        deque.addFirst(3);
        deque.addFirst(10);
        deque.addLast(1);
        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

       Deque<String> dq = new ArrayDeque<>();
       dq.push("A");
       dq.push("B");

       System.out.println(dq);
       dq.pop();
       System.out.println(dq);

   

    }
}
