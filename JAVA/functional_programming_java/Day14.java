import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Day14 {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(2);
        bq.put(10);
        bq.put(30);
       // bq.put(40); blocks
        System.out.println(bq);
        System.out.println(bq.take());

        System.out.println(bq);

    }
}
