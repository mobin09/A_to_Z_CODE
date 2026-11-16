import java.util.Arrays;

public class MinHeap {
    
   private int[] heap = new int[10];
   private int size = 0;

   public void insert(int value){
        if(size == heap.length){
            heap = Arrays.copyOf(heap, heap.length * 2 );
        }

        // Insert at  the last position
        heap[size] = value;
        int child = size;
        size++;
        
        // shift 
        while(size > 0){
            int parent = (child - 1 ) / 2;
            if(heap[child] < heap[parent]){
                int temp = heap[child];
                heap[child] = heap[parent];
                heap[parent] = temp;

                child = parent;
            } else{
                break;
            }
        }
   }

   public void dispaly(){
     for(int i = 0; i<size; i++){
        System.out.print(heap[i] + " ");
     }
   }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(40);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(10);

        minHeap.dispaly();
    }
}