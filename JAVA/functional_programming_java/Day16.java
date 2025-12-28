import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Day16 {
      public static void main(String[] args) {
          BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
          Thread producerThread = new Thread(new Producer(queue));
          Thread consumerThread = new Thread(new Consumer(queue));
    
          producerThread.start();
          consumerThread.start();
      }
}


class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    public void run(){
        try{
            int count = 1;
            while(true){
                System.out.println("Produced::" + count);
                queue.add(count); // block if producer full
                count++;
                Thread.sleep(500); // simulate time to produce
            }
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    public void run(){
        try {
        while(true){
            int item = queue.take(); // if empty blocks
            System.out.println("Consumed item is::" + item);
            Thread.sleep(1000);
        }
      } catch(InterruptedException ex){
        Thread.currentThread().interrupt();
      }
    }
} 

