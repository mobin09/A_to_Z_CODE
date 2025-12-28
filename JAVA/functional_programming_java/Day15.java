import java.util.Arrays;

public class Day15 {
    public static void main(String[] args) {
        CustomQueue cq = new CustomQueue(3);
        cq.enqueue(5);
        cq.enqueue(10);
        System.out.println(Arrays.toString(cq.arr));
                System.out.println(cq.size);

        cq.deque();
         cq.deque();
        System.out.println(cq.size);
    }
}
