public class CustomQueue {
   int[] arr;
   int front = 0;
   int rear = -1;
   int size = 0;
   public CustomQueue(int capacity){
    arr = new int[capacity];
   }

   public void enqueue(int x){
      if(arr.length == size){
        System.out.println("Queue is already filled");
        return;
      }

      rear = rear + 1 % arr.length;
      arr[rear] = x;
      size++;
   }

   public int deque() {
      if(size == 0){
        System.out.println("Queue is Empty");
        return -1;
      }

      int x = arr[front];
      front = front + 1 % arr.length;
      size--;
      return x;

   }

}


